package com.shiyi.mapper;

import com.shiyi.dao.CommentDao;

import java.util.List;

public interface CommentMapper {

    public void save(CommentDao comment);
    public List<CommentDao> getByPoetryId(String id);

}
