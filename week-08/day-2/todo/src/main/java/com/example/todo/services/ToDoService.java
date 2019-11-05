package com.example.todo.services;

import com.example.todo.models.ToDo;
import com.example.todo.repositories.RepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService implements ToDoServiceInterface {


    RepoInterface repo;

    @Autowired
    public ToDoService(RepoInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<ToDo> findAll() {
        List<ToDo> toDoList = new ArrayList<>();
        repo.findAll().forEach(o -> toDoList.add(o));
        return toDoList;
    }

    @Override
    public List<ToDo> findReady() {
        List<ToDo> toDoList = new ArrayList<>();
        repo.findAllByDone()
                .forEach(o -> toDoList.add(o));
        return toDoList;
    }
}
