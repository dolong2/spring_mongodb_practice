package com.practice.mongodb.domain.posting.service;

import com.practice.mongodb.domain.posting.Posting;
import com.practice.mongodb.domain.posting.presentation.dto.PostingReqDto;
import com.practice.mongodb.domain.posting.repository.PostingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostingService {
    private final PostingRepository postingRepository;

    @Transactional(rollbackFor = Exception.class)
    public void write(PostingReqDto postingReqDto){
        Posting posting = postingReqDto.toEntity();
        postingRepository.save(posting);
    }

}
