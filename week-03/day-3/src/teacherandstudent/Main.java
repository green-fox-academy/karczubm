package teacherandstudent;

public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        Student student=new Student();
        student.ask(teacher);
        teacher.teach(student);
    }
}
