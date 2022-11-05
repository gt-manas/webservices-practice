package com.demo.nov2022.webapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Service
@FeignClient(name="order" ,url = "${order.url}")
public interface OrderClient {

    @RequestMapping(method = RequestMethod.GET, value = "/general/order/{orderId}")
    public String getOrderStatus(@PathVariable("orderId") String orderId);
}
