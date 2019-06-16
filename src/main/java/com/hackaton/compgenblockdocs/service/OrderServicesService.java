package com.hackaton.compgenblockdocs.service;

import com.hackaton.compgenblockdocs.model.OrderServicesModel;
import com.hackaton.compgenblockdocs.repository.OrderServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesService {

    @Autowired
    private OrderServiceRepository repository;

    public OrderServicesModel createOrderService(OrderServicesModel m){
        return repository.save(m);
    }
}
