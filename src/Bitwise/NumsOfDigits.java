/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
// formula: No of digits in base b of no. n : 
// int (logb of n) +1 
// ===> logb of n = logx of n / logx of b
public class NumsOfDigits {
    public static void main(String[] args) {
        int n= 3243;
        int base = 10;
        int ans = (int)(Math.log(n)/Math.log(base))+1;
        System.out.println(ans);
    }
    
}
