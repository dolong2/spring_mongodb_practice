package com.practice.mongodb.domain.posting.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PostingListResDto {
    List<PostingResDto> list;
}
