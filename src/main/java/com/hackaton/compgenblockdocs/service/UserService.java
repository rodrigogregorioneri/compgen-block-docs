package com.hackaton.compgenblockdocs.service;

import com.hackaton.compgenblockdocs.model.Documents;
import com.hackaton.compgenblockdocs.model.UserModel;
import com.hackaton.compgenblockdocs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public UserModel createUser(UserModel m){
        return repository.save(m);
    }

    public void addDocumentToUser(Documents documents, String id){
       UserModel userModel =  repository.findById(id).get();
        List<Documents>  docs = userModel.getDocuments();
        docs.add(documents);
        userModel.setDocuments(docs);
       repository.save(userModel);

    }
}
