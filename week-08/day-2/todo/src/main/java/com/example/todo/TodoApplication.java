package com.example.todo;

import com.example.todo.models.ToDo;
import com.example.todo.repositories.RepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    RepoInterface repo;
    @Autowired
    public TodoApplication(RepoInterface repo) {
    this.repo=repo;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new ToDo("do something",false,true));
        repo.save(new ToDo("do something else",true,false));
        repo.save(new ToDo("something you should do"));
        repo.save(new ToDo("do it, really!",true,false));
        repo.save(new ToDo("c'mon! it won't hurt!"));
    }
}
