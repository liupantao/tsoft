package com.framework.tsoft.order.controller;


import com.framework.tsoft.api.user.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Reference(version = "1.0.0")
    private UserService userService;


    @RequestMapping(value="/api/userName")
    @ResponseBody
    public String  getUserName(){
        System.out.println("----测试user开始");
        String str = userService.userName("张三");
        System.out.println("----测试user结束"+str);
        return str;
    }

}
