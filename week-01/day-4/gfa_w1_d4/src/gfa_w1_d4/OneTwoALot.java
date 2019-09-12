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
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        
        if(0>=input) {
            System.out.println("Not enough!");
        }
        else if(input==1){
                System.out.println("One");
                }
        else if(input==2){
                System.out.println("Two");
                }
        else{
                System.out.println("A lot! WOW");
                }
    }
}
