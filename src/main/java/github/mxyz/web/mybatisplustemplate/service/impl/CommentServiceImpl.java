package github.mxyz.web.mybatisplustemplate.service.impl;

import github.mxyz.web.mybatisplustemplate.entity.Comment;
import github.mxyz.web.mybatisplustemplate.mapper.CommentMapper;
import github.mxyz.web.mybatisplustemplate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    @Cacheable(cacheNames = "commentCache", key = "#id")
    public Comment getCommentById(Integer id) {
        return commentMapper.selectById(id);
    }

    @Override
    @CachePut(cacheNames = "commentCache", key = "#comment.id")
    public Integer insertComment(Comment comment) {
        return commentMapper.insert(comment);
    }

    @Override
    @CachePut(cacheNames = "commentCache", key = "#comment.id")
    public Comment updateComment(Comment comment) {
        return commentMapper.updateById(comment) > 0 ? comment : null;
    }

    @Override
    @CacheEvict(cacheNames = "commentCache", key = "#id")
    public Integer deleteComment(Integer id) {
        return commentMapper.deleteById(id);
    }
}
