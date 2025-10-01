package github.mxyz.web.mybatisplustemplate.mapper;

import github.mxyz.web.mybatisplustemplate.entity.Comment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentMapperTest {
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void testSelectById() {
        Comment comment = commentMapper.selectById(1);
        assertNotNull(comment);
    }
}