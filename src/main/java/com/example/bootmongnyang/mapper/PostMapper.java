package com.example.bootmongnyang.mapper;

import com.example.bootmongnyang.model.Post;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostMapper {
    Post selectPostById(Integer id);
}
