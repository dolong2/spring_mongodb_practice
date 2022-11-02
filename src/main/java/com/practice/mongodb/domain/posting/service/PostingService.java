package com.practice.mongodb.domain.posting.service;

import com.practice.mongodb.domain.posting.Posting;
import com.practice.mongodb.domain.posting.presentation.dto.request.PostingReqDto;
import com.practice.mongodb.domain.posting.presentation.dto.response.PostingListResDto;
import com.practice.mongodb.domain.posting.presentation.dto.response.PostingResDto;
import com.practice.mongodb.domain.posting.repository.PostingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostingService {
    private final PostingRepository postingRepository;

    @Transactional(rollbackFor = Exception.class)
    public void write(PostingReqDto postingReqDto){
        Posting posting = postingReqDto.toEntity();
        postingRepository.save(posting);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PostingResDto getOnePosting(String id){
        Posting posting = postingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());
        return new PostingResDto(posting);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PostingListResDto getAllPosting(){
        return new PostingListResDto(
            postingRepository.findAll().stream()
                    .map(PostingResDto::new)
                    .collect(Collectors.toList())
        );
    }
}
