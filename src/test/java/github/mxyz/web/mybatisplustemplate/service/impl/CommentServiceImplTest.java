package github.mxyz.web.mybatisplustemplate.service.impl;

import github.mxyz.web.mybatisplustemplate.entity.Comment;
import github.mxyz.web.mybatisplustemplate.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentServiceImplTest {
    @Autowired
    private CommentService commentService;

    @Test
    void getCommentById() {
        Comment comment = commentService.getCommentById(1);
        assertNotNull(comment);
    }

    @Test
    void insertComment() {
        Comment comment = new Comment();
        comment.setContent("测试");
        comment.setAuthor("mxyz");
        int result = commentService.insertComment(comment);
        assertTrue(result > 0);
    }

    @Test
    void updateComment() {
        Comment comment = new Comment();
        comment.setId(1);
        comment.setContent("测试");
        int result = commentService.updateComment(comment);
        assertTrue(result > 0);
    }

    @Test
    void deleteComment() {
        int result = commentService.deleteComment(1);
        assertTrue(result > 0);
        Comment comment = commentService.getCommentById(1);
        assertNull(comment);
    }
}