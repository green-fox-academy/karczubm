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
public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input; j++) {
                if (i != 0 && i != input - 1) {
                    if (j == 0 || j == input-1) {
                        System.out.print("%");
                    }
                    else if(i==j){
                        System.out.print("%");
                    }
                    else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("%");
                }
            }
            System.out.println("");
        }
    }
}
