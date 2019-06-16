package com.hackaton.compgenblockdocs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "documentuser")
public class Services {

    @Id
    private String id;

    private List<Documents> listDocuments;

    private String name;


}
