package com.wendell.experiment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("yulao.tags")
public class Tag {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id; // BIGINT UNSIGNED -> Long

    @TableField("name")
    private String name;
    
}
