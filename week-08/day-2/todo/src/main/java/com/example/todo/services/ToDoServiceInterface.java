package com.example.todo.services;


import com.example.todo.models.ToDo;

import java.util.List;

public interface ToDoServiceInterface {

    List<ToDo> findAll();

    List<ToDo> findReady();

    List<ToDo> findTitle(String string);

    void addToDo(String newTodo);

    List<ToDo> findNotReady();

    void deleteById(String id);
}
