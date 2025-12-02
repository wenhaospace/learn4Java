package com.wendell.experiment.repository.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wendell.experiment.entity.TestingTable;

@Mapper
public interface TestingTableMapper extends BaseMapper<TestingTable>{

}
