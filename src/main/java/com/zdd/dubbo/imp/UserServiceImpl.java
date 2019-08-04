package com.zdd.dubbo.imp;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.zdd.dubbo.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String check(String name) {
        if(StringUtils.isBlank(name)){
            return "empty";
        }
        if(name.equals("zdd")){
            return "success";
        }
        return "fail";
    }
}
