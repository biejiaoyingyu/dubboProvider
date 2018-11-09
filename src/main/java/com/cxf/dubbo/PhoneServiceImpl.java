package com.cxf.dubbo;

import com.cxf.dubbo.entities.Phone;
import com.cxf.dubbo.service.PhoneService;

/**
 * Created by cxf on 2018/11/6.
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public Phone getPhoneById(Integer id) {
        Phone apple = new Phone("apple",100000);
        return apple;

    }
}
