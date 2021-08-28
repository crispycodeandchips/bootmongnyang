package com.example.bootmongnyang.mapper;

import com.example.bootmongnyang.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> selectCommentsByPostId(Integer postId);
}
