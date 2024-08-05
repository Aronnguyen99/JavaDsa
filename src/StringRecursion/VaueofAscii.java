/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

/**
 *
 * @author Nguyen Huy
 */
public class VaueofAscii {
    public static void main(String[] args) {
        valueAscii(0, "abc");
    }
     static void valueAscii(int value, String pattern){
         if(pattern.isEmpty()){
             System.out.println(value);
             return;
         }
          char check = pattern.charAt(0);
         valueAscii(value+check, pattern.substring(1));
     }      
}
