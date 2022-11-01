package com.practice.mongodb.domain.posting.presentation.dto.response;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PostingListResDto {
    List<PostingResDto> list;
}
