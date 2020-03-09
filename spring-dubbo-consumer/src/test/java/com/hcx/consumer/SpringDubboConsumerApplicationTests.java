package com.hcx.consumer;

import com.hcx.consumer.user.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDubboConsumerApplicationTests {

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {
        String user = userService.getUser();
        System.out.println(user);
    }

}
