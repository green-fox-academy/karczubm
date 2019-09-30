package gfinheritance;

public class Student extends Person {
    private String previousOrganization;
    private int skipDays;

    public Student(){
        super();
        this.previousOrganization="Da school of Life!";
        this.skipDays =0;
    }

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skipDays = 0;
    }


    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
        ;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " from" + previousOrganization +
                " who skipped " + skipDays + " days from the course already.");
    }
   public void skipDays (int numOfDays){
        numOfDays++;
   }
}
