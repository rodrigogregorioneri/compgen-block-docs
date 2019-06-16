package com.hackaton.compgenblockdocs.repository;

import com.hackaton.compgenblockdocs.model.OrderServicesModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderServiceRepository extends MongoRepository<OrderServicesModel, String> {
}
