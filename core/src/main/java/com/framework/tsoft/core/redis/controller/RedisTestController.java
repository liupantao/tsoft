package com.framework.tsoft.core.redis.controller;

import com.framework.tsoft.core.redis.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
public class RedisTestController {

    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping(value = "/redisTest")
    public String redisTest(){
        boolean set = redisUtils.set("toKey", "value001");
        System.out.println(set);
        return "Success";
    }
}
