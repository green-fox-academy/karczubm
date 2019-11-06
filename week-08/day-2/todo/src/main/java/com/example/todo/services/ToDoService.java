package com.example.todo.services;

import com.example.todo.models.ToDo;
import com.example.todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService implements ToDoServiceInterface {

    ToDoRepository repo;

    @Autowired
    public ToDoService(ToDoRepository repo) {
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
        repo.findAllByDoneIsTrue()
                .forEach(o -> toDoList.add(o));
        return toDoList;
    }

    @Override
    public List<ToDo> findTitle(String searched) {
        List<ToDo> toDoList = new ArrayList<>();
        repo.findAllByTitleContaining(searched).forEach(o -> toDoList.add(o));
        return toDoList;
    }

    @Override
    public void addToDo(String newTodo) {
        repo.save(new ToDo(newTodo));
    }

    @Override
    public List<ToDo> findNotReady() {
        List<ToDo> toDoList = new ArrayList<>();
        repo.findAllByDoneIsFalse()
                .forEach(o -> toDoList.add(o));
        return toDoList;
    }

    @Override
    public void deleteById(String id) {
        repo.deleteById(Long.getLong(id));
    }
}
