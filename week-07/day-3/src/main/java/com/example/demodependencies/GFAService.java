package com.example.demodependencies;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GFAService {
    ArrayList<String> names;

    public GFAService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int countStudents() {
        return names.size();
    }

    public boolean checkStudent(String student){
        return names.stream().anyMatch(s->s.equals(student));
    }
}
