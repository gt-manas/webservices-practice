package com.demo.nov2022.webapi.controller;

import com.demo.nov2022.webapi.service.serviceImpl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webapi/general")
public class WebApiController {

    @Autowired
    OrderServiceImpl orderService;



    @GetMapping("/welcome")
    public String welcome(){
        return "It is Welcome";
    }

    @GetMapping("/order/{orderId}")
    @ResponseBody
    public String StringGetOrderStatus(@PathVariable("orderId") String orderId){
        String orderStatus =orderService.getOrderStatus(orderId);
        return "It is from order MS order id :: " +  orderId +" order Status "+ orderStatus;
    }



}
