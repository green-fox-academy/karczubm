package animal;

public class Main {
    public static void main(String[] args) {
       Animal cat=new Animal();
       cat.eat();
       cat.play();
        System.out.println(cat.hunger+" "+cat.thirst);
    }
}
