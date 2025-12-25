package com.wendell.experiment.controller;

import java.util.List;

import com.wendell.experiment.common.ApiResponse;
import com.wendell.experiment.entity.Note;
import com.wendell.experiment.service.NoteService;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/notes")
public class NoteController {

    @Resource
    private NoteService noteService;
    
    @GetMapping()
    public ApiResponse<List<Note>> fetchAllNotes(){
        List<Note> result =  noteService.getAllNotes();
        return ApiResponse.ok(result);
    }

}
