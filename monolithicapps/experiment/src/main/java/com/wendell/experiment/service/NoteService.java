package com.wendell.experiment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wendell.experiment.entity.Note;
import com.wendell.experiment.repository.mapper.NoteMapper;
import com.wendell.experiment.repository.mapper.TagMapper;

import jakarta.annotation.Resource;

@Service
public class NoteService {

    @Resource
    private NoteMapper noteMapper;

    @Resource
    private TagMapper tagMapper;

    public void createNewNote(){

        Note newNote = new Note();

        noteMapper.insert(newNote);

    }

    public void deleteNote(){

    }

    public void updateNote(){

    }

    public List<Note> getAllNotes(){

        return noteMapper.selectList(null);
    }
    
    
}
