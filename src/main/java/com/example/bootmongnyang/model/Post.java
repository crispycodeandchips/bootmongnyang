package com.example.bootmongnyang.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.tomcat.jni.Local;
import org.thymeleaf.spring5.processor.SpringActionTagProcessor;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private String category;
    private String title;
    private String contents;
    private String userId;
    private LocalDateTime createTime;
    private Integer readCnt;
    private Integer postId;
    private Integer postType;
    private Integer region;
    private Integer postStatus;

}
