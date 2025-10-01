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
        assertNotNull(commentService.getCommentById(1));
    }

    @Test
    void insertComment() {
        assertNotNull(commentService.insertComment(new Comment(null, "test", "test", 1)));
    }

    @Test
    void updateComment() {
        assertNotNull(commentService.updateComment(new Comment(1, "test", "test", 1)));
    }

    @Test
    void deleteComment() {
        assertNotNull(commentService.deleteComment(1));
    }
}