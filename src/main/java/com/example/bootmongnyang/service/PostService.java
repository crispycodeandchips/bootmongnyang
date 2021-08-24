package com.example.bootmongnyang.service;

import com.example.bootmongnyang.mapper.PostMapper;
import com.example.bootmongnyang.model.Post;
import com.example.bootmongnyang.model.dto.GetPostDetailRespDto;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    PostMapper postMapper;

    public GetPostDetailRespDto getPostDetail(Integer id){
        // mapper(java와 SQL을 연결해주는 애들)를 불러서 id와 매치되는 해당 게시글 조회
        Post post = postMapper.selectPostById(id);
        // 조회수 + 1 (readcount)

        return new GetPostDetailRespDto();
    }
}
