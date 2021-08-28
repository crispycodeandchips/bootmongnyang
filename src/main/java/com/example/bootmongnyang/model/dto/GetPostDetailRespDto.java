package com.example.bootmongnyang.model.dto;

import com.example.bootmongnyang.model.Comment;
import com.example.bootmongnyang.model.Post;
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

    public GetPostDetailRespDto(Post post, List<Comment> comments) {
        this.category = post.getCategoryName();
        this.title = post.getTitle();
        this.userId = post.getUserId();
        this.createTime = post.getCreateTime();
        this.readCnt = post.getReadCnt();
        this.contents = post.getContents();
        this.comments = comments;
    }
}
