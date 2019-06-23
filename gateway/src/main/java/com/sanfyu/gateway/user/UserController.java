package com.sanfyu.gateway.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sanfyu.service.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: panyu
 * @Date: 2019/6/23 16:23
 * @Description:
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping(value = "sayHello")
    public void sayHello() {
        String param = userService.sayHello("panyu");
        System.out.println("param: " + param);
    }
}
