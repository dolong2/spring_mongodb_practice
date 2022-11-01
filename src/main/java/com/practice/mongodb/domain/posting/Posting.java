package com.practice.mongodb.domain.posting;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collation = "Posting")
public class Posting {
    @MongoId
    private String id;
    private String title;
    private String content;
}
