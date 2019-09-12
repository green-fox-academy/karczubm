/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gfa_w1_d4;

/**
 *
 * @author Gergely
 */
public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        
        int secondPassed=currentHours*60*60+currentMinutes*60+currentSeconds;
        System.out.println(24*60*60-secondPassed + " seconds left.");
    }
    
}
