package com.practice.mongodb.domain.posting.presentation.dto;

import com.practice.mongodb.domain.posting.Posting;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor

public class PostingReqDto {
    private String title;
    private String content;

    public Posting toEntity(){
        return Posting.builder()
                .id(UUID.randomUUID().toString().split("-")[0])
                .title(title)
                .content(content)
                .build();
    }
}
