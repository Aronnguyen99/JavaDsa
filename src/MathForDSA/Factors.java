/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathForDSA;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Huy
 */
public class Factors {
    public static void main(String[] args) {
        int n =20;
        //findingFactors(n);
        OptimizeFactors(n);
        System.out.println(224%105);
    }
    static void findingFactors(int n){
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
    static void OptimizeFactors(int n){
        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
           if(n%i==0){
           if(n/i==i){
                System.out.print(i+" ");
            }else{
                System.out.print(i+" ");
                list.add(n/i);                  
            }
           }
        }
        for (int i = list.size()-1; i >=0; i--) {
         System.out.print(list.get(i)+" "); 
        }
    }
}
