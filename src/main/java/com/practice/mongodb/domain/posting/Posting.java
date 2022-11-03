package com.practice.mongodb.domain.posting;

import com.practice.mongodb.domain.posting.presentation.dto.request.PostingUpdateDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Posting {
    @Id
    private String id;
    private String title;
    private String content;

    public void update(PostingUpdateDto postingUpdateDto){
        this.title = postingUpdateDto.getTitle();
        this.content = postingUpdateDto.getContent();
    }
}
