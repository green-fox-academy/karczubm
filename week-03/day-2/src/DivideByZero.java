import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number for division!");
        int result;
        do {
            result=divider(sc.nextInt());
        }
        while (result==0);
        System.out.println("Result is:"+result);
    }

    public static int divider(int inputNumber) {
        try {
            return 10 / inputNumber;
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero is impossible!");
            System.out.println("Try it again!");
            return 0;
        }
    }
}
