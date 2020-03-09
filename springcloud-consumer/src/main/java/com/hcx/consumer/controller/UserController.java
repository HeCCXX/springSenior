package com.hcx.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName UserController
 * @Description 用户controller类，通过restTemplate发送请求访问分布式服务
 * @Author 贺楚翔
 * @Date 2020-03-09 16:40
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name){
        String s = restTemplate.getForObject("http://PROVIDER/ticket", String.class);
        return  name + "购买了" + s;
    }
}
