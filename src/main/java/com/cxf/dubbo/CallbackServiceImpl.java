package com.cxf.dubbo;

import com.cxf.dubbo.callBack.CallBackListener;
import com.cxf.dubbo.service.CallbackService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CallbackServiceImpl implements CallbackService {
    private final Map<String, CallBackListener> listeners = new ConcurrentHashMap<String, CallBackListener>();
    /**
     * 构造器
     */
    public CallbackServiceImpl() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        for (Map.Entry<String, CallBackListener> entry : listeners.entrySet()) {
                            try {
                                //反向调用客户端的逻辑
                                entry.getValue().changed(getChanged(entry.getKey()));
                            } catch (Throwable t) {
                                listeners.remove(entry.getKey());
                            }
                        }
                        Thread.sleep(5000); // 定时触发变更通知
                    } catch (Throwable t) { // 防御容错
                        t.printStackTrace();
                    }
                }
            }
        });
        t.setDaemon(true);
        t.start();
    }

    @Override
    public void addListener(String key, CallBackListener listener) {
        listeners.put(key, listener);
        //反向调用客户端的逻辑
        listener.changed(getChanged(key)); // 发送变更通知
    }

    private String getChanged(String key) {
        return "Changed: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}
