package com.lsw.userconsumer.service;

import com.lsw.userconsumer.dao.UserDao;
import com.lsw.userconsumer.feign.UserFeign;
import com.lsw.userconsumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserFeign userFeign;

    @Autowired
    private UserDao userDao;

    @Autowired
    private DiscoveryClient discoveryClient;
    // Eureka客户端，可以获取到服务实例信息

    public List<User> queryUserByIds(List<Long> ids) {
        // ---------------1---------------
//        List<User> users = new ArrayList<>();
//        // String baseUrl = "http://localhost:8081/user/";
//        // 根据服务名称，获取服务实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service-lsw");
//        // 因为只有一个UserService,因此我们直接get(0)获取
//        ServiceInstance instance = instances.get(0);
//        // 获取ip和端口信息
//        String baseUrl = "http://"+instance.getHost() + ":" + instance.getPort()+"/user/";
//        ids.forEach(id -> {
//            // 我们测试多次查询，
//            users.add(this.restTemplate.getForObject(baseUrl + id, User.class));
//            // 每次间隔500毫秒
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        return users;

        // -----------------------2------------
//        List<User> users = new ArrayList<>();
//        // 地址直接写服务名称即可
//        String baseUrl = "http://user-service-lsw/user/";
//        ids.forEach(id -> {
//            // 我们测试多次查询，
//            users.add(this.restTemplate.getForObject(baseUrl + id, User.class));
//            // 每次间隔500毫秒
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//        return users;

        // -----------------------3------------
        List<User> users = new ArrayList<>();
        ids.forEach(id -> {
            users.add(this.userFeign.queryUserById(id));
        });
        return users;
    }
}
