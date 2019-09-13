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
public class tmpForFormatingText {

int c = 123;
int credits = 100;
boolean isBonus = false;
// if credits are at least 50,
// and isBonus is false decrement c by 2
// if credits are smaller than 50,
// and isBonus is false decrement c by 1
// if isBonus is true c should remain the same
if (!isBonus) {
    if (credits < 50) {
        c--;
    } else if (credits >= 50) {
        c -= 2;
    }
}
System.out.println (c);

