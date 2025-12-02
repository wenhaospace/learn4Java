package com.wendell.experiment.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.wendell.experiment.entity.TestingTable;
import com.wendell.experiment.repository.mapper.TestingTableMapper;

import jakarta.annotation.Resource;

@Service
public class TestingService {
    @Resource
    private TestingTableMapper tableMapper;

    public List<TestingTable> getAll(){
        return tableMapper.selectList(null);
    }

    public void create(TestingTable user) {
        tableMapper.insert(user);
    }
}
