package com.lsw.userconsumer.feign.impl;

import com.lsw.userconsumer.feign.UserFeign;
import com.lsw.userconsumer.pojo.User;
import org.springframework.stereotype.Component;

@Component
public class UserFeignFallback implements UserFeign {
    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
