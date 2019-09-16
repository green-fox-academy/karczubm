// Create the usual class wrapper and main method on your own.

import java.util.Scanner;

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
public class Sum {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(sum(sc.nextInt()));
    }
}
