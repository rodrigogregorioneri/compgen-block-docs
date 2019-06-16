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

    private String status;

    public void changeDocStatus(String newStatus) {
        this.setStatus(newStatus);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBase64Document() {
        return base64Document;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
    }

    public String getPunlic() {
        return punlic;
    }

    public void setPunlic(String punlic) {
        this.punlic = punlic;
    }

    public String getPrivat() {
        return privat;
    }

    public void setPrivat(String privat) {
        this.privat = privat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
