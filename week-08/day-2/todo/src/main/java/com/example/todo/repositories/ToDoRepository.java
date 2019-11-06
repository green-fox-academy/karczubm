package com.example.todo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.todo.models.ToDo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo,Long> {
    List<ToDo> findAllByDoneIsTrue();
    List<ToDo> findAllByTitleContaining(String string);
    List<ToDo> findAllByDoneIsFalse();
}
