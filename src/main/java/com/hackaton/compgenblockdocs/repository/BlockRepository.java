package com.hackaton.compgenblockdocs.repository;

import com.hackaton.compgenblockdocs.model.BlockModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlockRepository extends MongoRepository<BlockModel, String> {
}
