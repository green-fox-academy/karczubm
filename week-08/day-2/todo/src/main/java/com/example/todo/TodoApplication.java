package com.example.todo;

import com.example.todo.models.Assignee;
import com.example.todo.models.ToDo;
import com.example.todo.repositories.AssigneeRepository;
import com.example.todo.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    ToDoRepository toDoRepository;
    AssigneeRepository assigneeRepository;
    @Autowired
    public TodoApplication(ToDoRepository toDoRepository,AssigneeRepository assigneeRepository ) {
    this.toDoRepository =toDoRepository;
    this.assigneeRepository=assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("do something",false,true));
        toDoRepository.save(new ToDo("do something else",true,true));
        toDoRepository.save(new ToDo("something you should do"));
        toDoRepository.save(new ToDo("do it, really!",true,false));
        toDoRepository.save(new ToDo("c'mon! it won't hurt!"));
        assigneeRepository.save(new Assignee("name1","email1"));
        assigneeRepository.save(new Assignee("name2","email2"));
        assigneeRepository.save(new Assignee("name3","email3"));
        assigneeRepository.save(new Assignee("name4","email4"));
    }
}
