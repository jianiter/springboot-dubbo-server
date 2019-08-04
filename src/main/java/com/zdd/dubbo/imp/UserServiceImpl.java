package com.zdd.dubbo.imp;


import com.zdd.dubbo.UserService;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.util.StringUtils;
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String check(String name) {
        if(StringUtils.isEmpty(name)){
            return "empty";
        }
        if(name.equals("zdd")){
            return "success";
        }
        return "fail";
    }
}
