/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class BitwiseOddEvenCode {
    public static void main(String[] args) {
        finding(67);
    }
    static void finding(int n){
        int check = n&1;
        if(check==1){
            System.out.println(n+ " " +"is odd num");
        }else{
            System.out.println(n+ " " +"is even num");
        }
    }
}