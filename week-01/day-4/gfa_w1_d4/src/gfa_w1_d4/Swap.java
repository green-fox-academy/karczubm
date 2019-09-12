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
public class Swap {

    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int tmp;
        tmp=a;
        a=b;
        b=tmp;
        
        /*Segédváltozó nélkül
            int a=3;
            int b=4;
            a=a+b; 7
            b=a-b; 3
            a=a-b; 4
        */
        System.out.println(a);
        System.out.println(b);
    }
}
