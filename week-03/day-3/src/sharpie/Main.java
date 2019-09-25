package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie=new Sharpie("green", 3.4f);
        sharpie.use();
        System.out.println(sharpie.inkAmount);
    }
}
