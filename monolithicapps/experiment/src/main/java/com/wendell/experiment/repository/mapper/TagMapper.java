package com.wendell.experiment.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wendell.experiment.entity.Tag;

@Mapper
public interface TagMapper extends BaseMapper<Tag>{

}
