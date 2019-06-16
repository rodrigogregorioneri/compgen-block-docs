package com.hackaton.compgenblockdocs.service;


import com.hackaton.compgenblockdocs.model.DocumentUserModel;
import com.hackaton.compgenblockdocs.model.OrderServicesModel;
import com.hackaton.compgenblockdocs.repository.DocumentUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentUserService {

    @Autowired
    private DocumentUserRepository repository;


    public DocumentUserModel createDocumentUser(DocumentUserModel m){
        return repository.save(m);
    }


}
