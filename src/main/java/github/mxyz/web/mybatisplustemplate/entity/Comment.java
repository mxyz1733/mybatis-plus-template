package github.mxyz.web.mybatisplustemplate.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_comment")
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("content")
    private String content;
    @TableField("author")
    private String author;
    @JsonProperty("aId")
    @TableField("a_id")
    private Integer aId;
}