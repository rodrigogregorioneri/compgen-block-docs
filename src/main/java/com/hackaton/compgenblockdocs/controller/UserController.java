package com.hackaton.compgenblockdocs.controller;

import com.hackaton.compgenblockdocs.model.Documents;
import com.hackaton.compgenblockdocs.model.UserModel;
import com.hackaton.compgenblockdocs.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
public class UserController {


    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserModel createUser(@RequestBody UserModel user){
        return service.createUser(user);
    }

    @PostMapping("/addDocumentToUser/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDocumentToUser(@RequestBody Documents documents,@PathVariable(name = "id", required = false) String id){
         service.addDocumentToUser(documents,id);
    }



}
