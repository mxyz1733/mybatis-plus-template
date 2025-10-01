package github.mxyz.web.mybatisplustemplate.service;

import github.mxyz.web.mybatisplustemplate.entity.Comment;

public interface CommentService {
    Comment getCommentById(Integer id);
    Integer insertComment(Comment comment);
    Integer updateComment(Comment comment);
    Integer deleteComment(Integer id);
}
