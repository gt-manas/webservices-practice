package com.demo.nov2022.webapi.service.serviceImpl;

import com.demo.nov2022.webapi.feign.OrderClient;
import com.demo.nov2022.webapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderClient orderClient;

    @Override
    public String getOrderStatus(String orderId) {
        //Call Order MS to get the Status.
        String orderIdStatus = orderClient.getOrderStatus(orderId);
        return orderIdStatus;
    }
}
