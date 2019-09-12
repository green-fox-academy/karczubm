        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfa_w1_d4;

import java.util.Scanner;

/**
 *
 * @author Gergely
 */
public class CountFromTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip1, ip2;
        do {
            ip1 = sc.nextInt();
            ip2 = sc.nextInt();
            if (ip2 < ip1) {
                System.out.println("The second one should be bigger!");
            }
        } while (ip2 < ip1);
        System.out.println("first number: "+ip1+"second number: "+ip2);
        for (int i=ip1; i < ip2; i++) {
            System.out.println(i);
        }
        

    }
}
