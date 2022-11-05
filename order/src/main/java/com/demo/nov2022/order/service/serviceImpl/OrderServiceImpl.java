package com.demo.nov2022.order.service.serviceImpl;


import com.demo.nov2022.order.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getOrderStatus(String orderId) {
        //Call Order MS to get the Status.
        return "OrderId : " + orderId + "  From Order MS serviceImpl "  ;
    }
}
