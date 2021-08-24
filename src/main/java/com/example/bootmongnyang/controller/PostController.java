package com.example.bootmongnyang.controller;

import com.example.bootmongnyang.model.dto.GetPostDetailRespDto;
import com.example.bootmongnyang.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<GetPostDetailRespDto> getPostDetail(@PathVariable("id") Integer id) {
        return new ResponseEntity<>(postService.getPostDetail(id), HttpStatus.OK);

    }
}
