package com.hackaton.compgenblockdocs.repository;

import com.hackaton.compgenblockdocs.model.Services;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ServicesRepository extends MongoRepository<Services, String> {

}
