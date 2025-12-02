package com.wendell.experiment.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

@Data
@TableName("YULAO_TESTING")
public class TestingTable {
    @TableId(type = IdType.AUTO)
    private Long id;
    

    private String userName;
}
