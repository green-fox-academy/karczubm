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
public class PartyIndicator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ip1=sc.nextInt();
        int ip2=sc.nextInt();
        
        if (ip1==ip2 && (ip1+ip2)>=20) {
            System.out.println("Excellent party!");
        }
        else if (ip1!=ip2 && (ip1+ip2)>20) {
            System.out.println("Quite cool!");
        }
        else if(ip1==0){
            System.out.println("Sausage party!");
        }
        else if ((ip1+ip2)<20) {
            System.out.println("Average party!");
        }
        
    }
}
