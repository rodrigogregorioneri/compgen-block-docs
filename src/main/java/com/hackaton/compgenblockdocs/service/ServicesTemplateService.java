package com.hackaton.compgenblockdocs.service;

import com.hackaton.compgenblockdocs.model.Services;
import com.hackaton.compgenblockdocs.repository.ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesTemplateService {

    @Autowired
    private ServicesRepository repository;

    public Services createServices(Services m){
       return repository.save(m);
    }

}
