package com.example.bootmongnyang.service;

import com.example.bootmongnyang.mapper.CommentMapper;
import com.example.bootmongnyang.mapper.PostMapper;
import com.example.bootmongnyang.model.Comment;
import com.example.bootmongnyang.model.Post;
import com.example.bootmongnyang.model.dto.GetPostDetailRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    private final CommentMapper commentMapper;

    public GetPostDetailRespDto getPostDetail(Integer id){
        // mapper(java와 SQL을 연결해주는 애들)를 불러서 id와 매치되는 해당 게시글 조회
        Post post = postMapper.selectPostById(id);
        List<Comment> comments =  commentMapper.selectCommentsByPostId(id);
        // 조회수 + 1 (readcount)
        postMapper.updateReadCntById(id);

        return new GetPostDetailRespDto(post, comments);
    }
}
