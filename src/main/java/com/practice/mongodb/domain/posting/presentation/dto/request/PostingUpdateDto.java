package com.practice.mongodb.domain.posting.presentation.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostingUpdateDto {
    private String title;
    private String content;
}
