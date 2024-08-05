/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

/**
 *
 * @author Nguyen Huy
 */
public class Subsequence {
    public static void main(String[] args) {
        String patter = "abc";
        subsequ("", patter);
    }
    static void subsequ(String empt, String pattern){
        if(pattern.isEmpty()){
            System.out.println(empt);
            return;
        }
        char check = pattern.charAt(0);
        subsequ(empt+check, pattern.substring(1));
        subsequ(empt, pattern.substring(1));
    }
}
