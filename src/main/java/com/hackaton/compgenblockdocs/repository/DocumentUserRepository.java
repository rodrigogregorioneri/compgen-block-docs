package com.hackaton.compgenblockdocs.repository;

import com.hackaton.compgenblockdocs.model.DocumentUserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentUserRepository extends MongoRepository<DocumentUserModel, String> {
}
