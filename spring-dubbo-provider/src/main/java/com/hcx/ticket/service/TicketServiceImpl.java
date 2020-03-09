package com.hcx.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName TicketServiceImpl
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-09 13:24
 * @Version 1.0
 **/
@Component
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "it is hcx's dubbo test";
    }
}
