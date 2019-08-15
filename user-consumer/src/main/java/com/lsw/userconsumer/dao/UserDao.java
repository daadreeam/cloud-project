package com.lsw.userconsumer.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserDao {

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @HystrixCommand(fallbackMethod = "queryUserByIdFallback")
//    public User queryUserById(Long id){
//        long begin = System.currentTimeMillis();
//        String url = "http://user-service-lsw/user/" + id;
//        User user = this.restTemplate.getForObject(url, User.class);
//        long end = System.currentTimeMillis();
//        // 记录访问用时：
//        log.info("访问用时：{}", end - begin);
//        return user;
//    }
//
//    public User queryUserByIdFallback(Long id){
//        User user = new User();
//        user.setId(id);
//        user.setName("用户信息查询出现异常！");
//        return user;
//    }
}
