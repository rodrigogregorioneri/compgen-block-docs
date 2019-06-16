package com.hackaton.compgenblockdocs.model;

public class Documents {

    private String id;

    private String base64Document;

    private String punlic;

    private String privat;

    private String type;

    private String statusDocument;

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

    public String getStatusDocument() {
        return statusDocument;
    }

    public void setStatusDocument(String statusDocument) {
        this.statusDocument = statusDocument;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
