/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class Product1toN {
    public static void main(String[] args) {
        System.out.println(product(5));
    }
    static int product(int n){
        if(n==1){
            return 1;
        }
        return n*product(n-1);
    }
}
