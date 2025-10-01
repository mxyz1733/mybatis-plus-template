package github.mxyz.web.mybatisplustemplate.service.impl;

import github.mxyz.web.mybatisplustemplate.entity.Comment;
import github.mxyz.web.mybatisplustemplate.mapper.CommentMapper;
import github.mxyz.web.mybatisplustemplate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentPlusMapper;

    @Override
    public Comment getCommentById(Integer id) {
        return commentPlusMapper.selectById(id);
    }

    @Override
    public Integer insertComment(Comment comment) {
        return commentPlusMapper.insert(comment);
    }

    @Override
    public Integer updateComment(Comment comment) {
        return commentPlusMapper.updateById(comment);
    }

    @Override
    public Integer deleteComment(Integer id) {
        return commentPlusMapper.deleteById(id);
    }
}
