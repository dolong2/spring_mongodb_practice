package com.practice.mongodb.domain.posting.presentation.controller;

import com.practice.mongodb.domain.posting.presentation.dto.request.PostingReqDto;
import com.practice.mongodb.domain.posting.presentation.dto.response.PostingListResDto;
import com.practice.mongodb.domain.posting.presentation.dto.response.PostingResDto;
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

    @GetMapping
    public ResponseEntity<PostingListResDto> getAllPosting(){
        return ResponseEntity.ok(postingService.getAllPosting());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostingResDto> getOnePosting(@PathVariable String id){
        return ResponseEntity.ok(postingService.getOnePosting(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePosting(@PathVariable String id){
        postingService.deletePosting(id);
        return ResponseEntity.ok().build();
    }
}
