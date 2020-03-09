package com.hcx.provider.controller;

import com.hcx.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TicketController
 * @Description TODO
 * @Author 贺楚翔
 * @Date 2020-03-09 16:31
 * @Version 1.0
 **/
@RestController
public class TicketController {

    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
