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
public class Cuboid {
    public static void main(String[] args) {
        double a=10;
        double b=11;
        double c=12;
        
        System.out.println("The surface is:"+(int)(2*a*b+2*a*c+2*b*c));
        System.out.println("The volume is:"+(int)(a*b*c));
    }
}
