package com.wendell.experiment.repository.mapper;

import com.wendell.experiment.entity.Note;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface NoteMapper extends BaseMapper<Note>{
    
}
