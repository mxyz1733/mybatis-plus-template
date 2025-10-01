package github.mxyz.web.mybatisplustemplate.controller;

import github.mxyz.web.mybatisplustemplate.entity.Comment;
import github.mxyz.web.mybatisplustemplate.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/get")
    public Comment getCommentById(@PathParam("id") Integer id) {
        return commentService.getCommentById(id);
    }

    @PutMapping("/insert")
    public Integer insertComment(@PathParam("comment") Comment comment) {
        return commentService.insertComment(comment);
    }

    @PostMapping("/update")
    public Comment updateComment(@PathParam("comment") Comment comment) {
        return commentService.updateComment(comment);
    }

    @DeleteMapping("/delete")
    public Integer deleteComment(@PathParam("id") Integer id) {
        return commentService.deleteComment(id);
    }
}
