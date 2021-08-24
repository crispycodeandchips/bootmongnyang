package com.example.bootmongnyang.model.dto;

import com.example.bootmongnyang.model.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetPostDetailRespDto {
    private String category;
    private String title;
    private String userId;
    private LocalDateTime createTime;
    private Integer readCnt;
    private String contents;
    private List<Comment> comments;
}
