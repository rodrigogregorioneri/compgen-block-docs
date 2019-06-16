package com.hackaton.compgenblockdocs.model;

import com.fasterxml.jackson.databind.JsonNode;

public class MetaData {

    private String id;

    private JsonNode raw;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JsonNode getRaw() {
        return raw;
    }

    public void setRaw(JsonNode raw) {
        this.raw = raw;
    }
}
