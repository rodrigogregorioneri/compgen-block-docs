package com.hackaton.compgenblockdocs.controller;


import com.hackaton.compgenblockdocs.model.BlockModel;
import com.hackaton.compgenblockdocs.model.OrderServicesModel;
import com.hackaton.compgenblockdocs.service.BlockchainModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/blockchain")
public class BlockController {

    @Autowired
    private BlockchainModel service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<BlockModel> createUser(String data){
        return service.start(data);
    }


    @GetMapping
    public List<BlockModel> listBlock(){
        return service.listBlock();
    }

    @GetMapping("/addDocumentToUser/{query}")
    public List<BlockModel> listBlock(@PathVariable(name = "query", required = false) String query){
        return service.listByParam(query);
    }




}
