package com.hackaton.compgenblockdocs.controller;

import com.hackaton.compgenblockdocs.model.OrderServicesModel;
import com.hackaton.compgenblockdocs.service.OrderServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/order-services")
public class OrderServiceController {


    @Autowired
    private OrderServicesService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderServicesModel createUser(@RequestBody OrderServicesModel orderService){
        return service.createOrderService(orderService);
    }
}
