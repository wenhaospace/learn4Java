package com.wendell.experiment.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("yulao.notes")
public class Note {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // BIGINT UNSIGNED -> Long

    @TableField("platform")
    private String platform = "";

    @TableField("description")
    private String description;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField("url")
    private String url;

    @TableField("sort")
    private Integer sort = 0;
    
}
