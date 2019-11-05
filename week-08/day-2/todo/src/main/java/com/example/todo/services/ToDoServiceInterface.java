package com.example.todo.services;


import com.example.todo.models.ToDo;
import java.util.List;

public interface ToDoServiceInterface {

    List<ToDo> findAll();
    List<ToDo> findReady();


}
