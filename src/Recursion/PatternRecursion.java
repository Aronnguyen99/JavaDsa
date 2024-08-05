/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class PatternRecursion {
    public static void main(String[] args) {
        RevTriangle2(4, 0);
    }
    static void RevTriangle(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            RevTriangle(r, c+1);
        }else{
            System.out.println("");
            RevTriangle(r-1, 0);
            
        }
    }
    static void RevTriangle2(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){  
            RevTriangle2(r, c+1);
            System.out.print("*");
        }else{
        
            RevTriangle2(r-1, 0);
            System.out.println("");
        }
    }
}
