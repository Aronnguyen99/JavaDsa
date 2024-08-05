/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findingFibo(7));
    }
    
    static int findingFibo(int n){
        if(n==0){
            return 0;
        //    System.out.println(0);
        }
        if(n==1){
            return 1;
            //System.out.println(1);
        }
        return findingFibo(n-1)+ findingFibo(n-2);
        
    }
}
