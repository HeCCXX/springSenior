package com.hcx.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName AsyncService
 * @Description 异步服务类
 * @Author 贺楚翔
 * @Date 2020-03-05 17:00
 * @Version 1.0
 **/
@Service
public class AsyncService {

    @Async
    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务请求中。。。");
    }

}
