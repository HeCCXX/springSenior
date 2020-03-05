package com.hcx.task.controller;

import com.hcx.task.service.AsyncService;
import com.hcx.task.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName AsyncController
 * @Description 异步controller类
 * @Author 贺楚翔
 * @Date 2020-03-05 16:59
 * @Version 1.0
 **/
@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @Autowired
    ScheduleService scheduleService;

    @GetMapping("/hello")
    public String hello(){
        asyncService.hello();
        return "success";
    }

    @GetMapping("/hello1")
    public String helloSchedule(){
        scheduleService.hello();
        return "success";
    }
}
