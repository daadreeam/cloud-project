package com.lsw.userconsumer.feign;

import com.lsw.userconsumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service-lsw")
public interface UserFeign {

    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
