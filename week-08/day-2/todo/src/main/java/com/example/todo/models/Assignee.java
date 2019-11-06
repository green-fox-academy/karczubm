package com.example.todo.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Assignee {

    @Id
    @GeneratedValue()
    private Long id;

    private String name;
    private String  email;

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
