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
public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        if(input%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
