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
public class ParameticAverage {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        for (int i = 0; i < repeat; i++) {
            System.out.println("Pls give me a number:");
            int input = sc.nextInt();
            sum += input;
        }
        System.out.println("Sum: " + sum + ", Average: " + sum / 5.0);
    }
}
