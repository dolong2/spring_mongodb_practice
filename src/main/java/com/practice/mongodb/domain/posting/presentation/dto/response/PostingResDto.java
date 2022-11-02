package com.practice.mongodb.domain.posting.presentation.dto.response;

import com.practice.mongodb.domain.posting.Posting;
import lombok.Getter;

@Getter
public class PostingResDto {
    private String id;
    private String title;
    private String content;

    public PostingResDto(Posting posting) {
        this.id = posting.getId();
        this.title = posting.getTitle();
        this.content = posting.getContent();
    }
}
