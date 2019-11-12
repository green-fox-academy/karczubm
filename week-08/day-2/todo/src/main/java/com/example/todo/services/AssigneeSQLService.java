package com.example.todo.services;

import com.example.todo.models.Assignee;
import com.example.todo.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService implements AssigneeServicInterface {
    @Autowired
    AssigneeRepository repository;

    @Override
    public List<Assignee> findAll() {
        List<Assignee> assigneeList=new ArrayList<>();
        repository.findAll().forEach(a->assigneeList.add(a));
        return assigneeList;
    }

    @Override
    public void alterName(String name,String newName) {
        repository.findByName(name).setName(newName);
    }

    @Override
    public void deleteAssignee(String name) {
        repository.deleteByName(name);
    }

    @Override
    public void addAssignee(String name, String email) {
        repository.save(new Assignee(name,email));
    }

    @Override
    public Assignee findById(Long id) {
        return repository.findById(id).get();
    }
}
