package com.cxf.dubbo;

import com.cxf.dubbo.entities.User;
import com.cxf.dubbo.service.UserService;

/**
 * Created by cxf on 2018/11/6.
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Integer id) {
        User user  = new User() ;
        user.setAge(id);
        user.setName("正常");
        return user;
    }
}
