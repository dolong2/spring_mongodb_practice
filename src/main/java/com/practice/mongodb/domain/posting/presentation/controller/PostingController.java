package com.practice.mongodb.domain.posting.presentation.controller;

import com.practice.mongodb.domain.posting.presentation.dto.PostingReqDto;
import com.practice.mongodb.domain.posting.service.PostingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posting")
@RequiredArgsConstructor
public class PostingController {
    private final PostingService postingService;

    @PostMapping
    public ResponseEntity<Void> savePosting(@RequestBody PostingReqDto postingReqDto){
        postingService.write(postingReqDto);
        return ResponseEntity.ok().build();
    }
}
