/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class PowerofTwo {
    public static void main(String[] args) {
        int n= 4;
        int check = n&(n-1);
        if(check==0){
            System.out.println(n+ " " + "is the power of two");
        }else{
            System.out.println(n+ " " + "is not the power of two");
        }
    }
    
}
