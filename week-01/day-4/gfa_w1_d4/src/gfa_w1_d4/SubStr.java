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
public class SubStr {

    public static int subStr(String input, String q) {
        int intIndex = input.indexOf(q);
        if (intIndex == -1) {
            return -1;
        } else {
            return intIndex;
        }
    }

    public static void main(String[] args) {
        String ip1, ip2;
        Scanner sc = new Scanner(System.in);
        ip1 = sc.nextLine();
        ip2 = sc.nextLine();
        System.out.println(subStr(ip1, ip2));
    }
}
