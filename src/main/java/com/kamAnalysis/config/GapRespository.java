package com.kamAnalysis.config;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface GapRespository extends MongoRepository<Gap, String> {

}
