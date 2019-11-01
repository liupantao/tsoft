package com.framework.tsoft.user.service;

import com.framework.tsoft.api.user.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Controller;


@Service(version = "1.0.0")
public class UserServiceImpl  implements UserService {




    @Override
    public String userName(String userName) {

        return userName;
    }
}
