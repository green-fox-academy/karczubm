package gfinheritance;

public class Person {
    private  int age;
    private String gender;
    private String name;

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age, String gender){
        this.gender=gender;
        this.name=name;
        this.age=age;
    }
    public Person(){
        this.gender="female";
        this.name="Jane Doe";
        this.age=30;
    }

    public void introduce(){
        System.out.println("Hi, I'm "+name+", a "+age+" year old "+gender+".");
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}
