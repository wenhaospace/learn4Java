package com.wendell.experiment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wendell.experiment.entity.TestingTable;
import com.wendell.experiment.service.TestingService;

import jakarta.annotation.Resource;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("test")
public class TestController {

    @Resource
    private TestingService testingService;

    @GetMapping("/query1")
    public String requestMethodName(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/getAllTestData")
    public List<TestingTable> geAlltTestData() {
        return testingService.getAll();
    }
    
    

}
