package com.sanfyu.service.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sanfyu.service.user.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @Author: panyu
 * @Date: 2019/6/23 16:07
 * @Description:
 */
@Component
@Service(version = "1.0.0", timeout = 10000, interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String username) {
        return "sayHello to " + username + "!";
    }
}
