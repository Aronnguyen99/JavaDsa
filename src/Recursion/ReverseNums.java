/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class ReverseNums {
    public static void main(String[] args) {
     
        System.out.println(reverse2(1234));
    }
    static int rev = 0;
    static void reverse(int n){
        if(n==0){
            return ;
        }
        rev=rev*10+n%10;
        reverse(n/10);   
    }
    static int reverse2(int n){
        int argu = (int)Math.log10(n)+1;
        return helper(n,argu);
    }
    private static int helper(int n, int argu){
        if(n%10==n){
            return n;
        }
        return n%10*(int)Math.pow(10, argu-1)+helper(n/10,argu-1);
    }
}
