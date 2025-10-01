package github.mxyz.web.mybatisplustemplate.service;

import github.mxyz.web.mybatisplustemplate.entity.Comment;

public interface CommentService {
    Comment getCommentById(Integer id);
    Integer insertComment(Comment comment);
    Comment updateComment(Comment comment);
    Integer deleteComment(Integer id);
}
