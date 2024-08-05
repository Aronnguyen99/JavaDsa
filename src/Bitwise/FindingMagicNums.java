/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class FindingMagicNums {
    public static void main(String[] args) {
        int base = 5; 
        int n = 6; 
        int ans =0;
        while(n>0){
            int last = n&1;
            n =n>>1;
            ans += last *base;
            base*=5;
        }
        System.out.println(ans);
    }
}
