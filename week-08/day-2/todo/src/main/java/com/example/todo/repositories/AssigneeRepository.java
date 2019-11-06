package com.example.todo.repositories;

import com.example.todo.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
    List<Assignee> findAll();
    Assignee findByName(String name);
    @Transactional
    void deleteByName(String name);
}
