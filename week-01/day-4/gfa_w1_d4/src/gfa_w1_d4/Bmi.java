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
public class Bmi {

    public static void main(String[] args) {
        double massInKg = 75.0;
        double heightInM = 1.75;
        System.out.println("My BMI is:"+ massInKg/(heightInM*heightInM) );
    }
}
