package com.hackaton.compgenblockdocs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orderservice")
public class OrderServicesModel {

    @Id
    private String id;

    private String id_usuario;

    private String id_document;

    private String timestamp;

    private String status;


}
