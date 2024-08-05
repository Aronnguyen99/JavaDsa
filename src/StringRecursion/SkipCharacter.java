/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

/**
 *
 * @author Nguyen Huy
 */
public class SkipCharacter {
    public static void main(String[] args) {
        String s = "baccad";
       
        System.out.println( skipping( s));
    }
    static String skipping( String pattern){
        if(pattern.isEmpty()){
            return "";
        }
        char check = pattern.charAt(0);
        if(check == 'a'){
           return skipping(pattern.substring(1));
        }else{
            return check + skipping(pattern.substring(1));
        }
    }
    static void skippingNoReturn(String emmt,String pattern){
        if(pattern.isEmpty()){
            return;
        }
        char check = pattern.charAt(0);
        
        if(check == 'a'){
            skippingNoReturn(emmt, pattern.substring(1));
        }else{
            skippingNoReturn(check +emmt, pattern.substring(1));
        }
        
    }
}
