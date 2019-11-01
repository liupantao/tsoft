package com.framework.tsoft.order.service;

import com.framework.tsoft.api.order.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class OrderServiceImpl implements OrderService {

    @Override
    public String sayHello() {
        return "sayHello";
    }
}
