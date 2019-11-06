package com.example.todo.services;

import com.example.todo.models.Assignee;

import java.util.List;

public interface AssigneeServicInterface {
    List<Assignee> findAll();
    void alterName(String name,String newName);

    void deleteAssignee(String name);

    void addAssignee(String name, String email);
}
