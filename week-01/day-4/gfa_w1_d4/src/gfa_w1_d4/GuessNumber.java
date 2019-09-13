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
public class GuessNumber {
    public static void main(String[] args) {
        int hiddenNumber= 6;
        boolean answer=false;
        Scanner sc=new Scanner(System.in);
        int guess;
        
        do{
            guess=sc.nextInt();
            if(guess<hiddenNumber){
                System.out.println("The number is higher.");
            }
            else if(guess>hiddenNumber){
                System.out.println("The number is lower.");
            }
            else{
                System.out.println("You found it! It's "+hiddenNumber+".");
                answer=true;
            }
        }while(!answer);
    }
    
    
}
