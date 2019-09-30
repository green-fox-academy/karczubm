package gfinheritance;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String cohortName;
    List<Student> students;
    List<Mentor> mentors;

    public Cohort(String name) {
        this.cohortName = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void info() {
        System.out.println("The " + cohortName + " has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }
}
