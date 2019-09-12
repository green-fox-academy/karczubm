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
public class PrintBigger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        
        if(input1>input2){
            System.out.println("the bigger: "+input1);
        }
        else if(input1<input2){
            System.out.println("the bigger: "+input2);
        }
        else{
            System.out.println("Equals");
        }
            
    }
}
