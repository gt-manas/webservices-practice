package com.demo.nov2022.order.controller;

import com.demo.nov2022.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order/general")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/welcome")
    public String welcome(){
        return "It is Welcome";
    }

    @GetMapping("/order/{orderId}")
    @ResponseBody
    public String StringGetOrderStatus(@PathVariable("orderId") String orderId){
        String orderStatus =orderService.getOrderStatus(orderId);
        return  orderStatus;
    }

}
