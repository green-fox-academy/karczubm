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
public class DrawChessTable {

    public static void main(String[] args) {
        //A megoldás
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    System.out.print("%");
                    System.out.print(" ");
                } else {
                    System.out.print(" ");
                    System.out.print("%");
                }
            }
            System.out.println("");
        }
        //B megoldás
        String a = "% % % % ";
        String b = " % % % %";
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
