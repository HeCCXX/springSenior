package com.hcx.consumer.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hcx.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description user服务实现类
 * @Author 贺楚翔
 * @Date 2020-03-09 13:26
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Reference
    TicketService ticketService;
    @Override
    public String getUser() {
        String ticket = ticketService.getTicket();
        System.out.println("测试语句："+ticket);
        return "测试语句："+ticket;
    }
}
