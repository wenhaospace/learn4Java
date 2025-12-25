package com.wendell.experiment.controller;

import java.util.List;

import com.wendell.experiment.entity.Note;
import com.wendell.experiment.service.NoteService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/notes")
public class NoteController {

    @Resource
    private NoteService noteService;

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping()
    public List<Note> fetchAllNotes(){
        return noteService.getAllNotes();
    }

}
