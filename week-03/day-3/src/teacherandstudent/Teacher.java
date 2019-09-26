package teacherandstudent;

public class Teacher {
    public void answer(){
        System.out.println("answering a question");
    }
    public void teach(Student student){
        student.learn();
    }
}
