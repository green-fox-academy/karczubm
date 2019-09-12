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
public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double input=sc.nextDouble();
        System.out.println(input+" miles = "+input*1.60934+" kilometers");
    }
}
