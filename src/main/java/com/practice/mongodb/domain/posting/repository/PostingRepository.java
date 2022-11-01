package com.practice.mongodb.domain.posting.repository;

import com.practice.mongodb.domain.posting.Posting;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostingRepository extends MongoRepository<Posting, String> {
}
