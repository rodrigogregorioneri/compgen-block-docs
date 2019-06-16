package com.hackaton.compgenblockdocs.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documentuser")
public class DocumentUserModel {

    @Id
    private String id;

    private String base64Document;

    private String punlic;

    private String privat;
}
