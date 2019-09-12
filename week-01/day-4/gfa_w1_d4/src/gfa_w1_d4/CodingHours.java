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
public class CodingHours {
    public static void main(String[] args) {
        System.out.println("An attendee spend " + 6*17*5+ " hours on coding.");
        System.out.println("It's "+((int)(((6.0*17*5)/(17*52))*10000)/100.0)+"% of the total worktime.");
                
    }
}
