package com.hackaton.compgenblockdocs.model;

import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.data.annotation.Id;

import java.util.List;

@Document(collection = "user")
public class UserModel {

    @Id
    private String id;

    private String email;

    private String senha;

    private String cpf;

    private String perm;

    private List<Documents> documents;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    public List<Documents> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Documents> documents) {
        this.documents = documents;
    }
}
