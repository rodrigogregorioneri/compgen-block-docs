package com.hackaton.compgenblockdocs.repository;

import com.hackaton.compgenblockdocs.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository  extends MongoRepository<UserModel, String> {
}
