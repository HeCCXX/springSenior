package com.hcx.amqp;

import com.hcx.amqp.bean.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
*rabbitmq 发送消息
* @return
* @exception
**/
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Test
    public void contextLoads() {
        rabbitTemplate.convertAndSend("hcx.hcx","hcx.h1",new Book("贺楚翔","贺楚翔"));
//        rabbitTemplate.convertAndSend("hcx.hcx","hcx.h1","this hcx's message!");
    }


    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("hcx.h1");
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
