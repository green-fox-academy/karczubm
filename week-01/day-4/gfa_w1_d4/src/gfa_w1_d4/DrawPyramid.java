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
public class DrawPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if ((input + 3) % 2 == 0) {//páros 
            input++;
        }
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input + 3; j++) {
                int mid = (input + 3) / 2;
                if (j == mid || (j <= mid + i && j >= mid - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
