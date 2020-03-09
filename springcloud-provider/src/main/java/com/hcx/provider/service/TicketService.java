package com.hcx.provider.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName TicketService
 * @Description 服务类，具体业务逻辑
 * @Author 贺楚翔
 * @Date 2020-03-09 16:25
 * @Version 1.0
 **/
@Service
public class TicketService {
    public String getTicket(){
        return "it is hcx's springcloud test.";
    }

}
