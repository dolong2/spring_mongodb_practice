package com.practice.mongodb.domain.posting.facade;

import com.practice.mongodb.domain.posting.Posting;
import com.practice.mongodb.domain.posting.repository.PostingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PostingFacade {
    private final PostingRepository postingRepository;

    public Posting findOneById(String id){
        return postingRepository.findById(id)
                .orElseThrow(()->new RuntimeException());
    }
}
