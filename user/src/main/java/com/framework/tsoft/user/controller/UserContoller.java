package com.framework.tsoft.user.controller;

import com.framework.tsoft.api.order.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserContoller {

    @Reference(version = "1.0.0")
    private OrderService orderService;

    @RequestMapping(value = "/api/user")
    @ResponseBody
    public String testService(){
       System.out.println("服务测试开始---》》");
        String s = orderService.sayHello();
        System.out.println("服务测试结果---》"+s);
        return s;
    }
}
