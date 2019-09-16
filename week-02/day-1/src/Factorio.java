//  Create the usual class wrapper
//  and main method on your own.

import java.util.Scanner;

// - Create a function called `factorio`
//   that returns it's input's factorial
public class Factorio {
    public static int factorio(int n){
            int fac =1;
            for(int i=1;i<=n;i++) {
        fac *= i;
    }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(factorio(sc.nextInt()));
    }
}
