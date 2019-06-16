package com.hackaton.compgenblockdocs.controller;


import com.hackaton.compgenblockdocs.model.DocumentUserModel;
import com.hackaton.compgenblockdocs.service.DocumentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/document")
public class DocumentUserController {

    @Autowired
    private DocumentUserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DocumentUserModel createUser(@RequestBody DocumentUserModel orderService){
        return service.createDocumentUser(orderService);
    }

}
