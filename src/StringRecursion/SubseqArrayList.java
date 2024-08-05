/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Huy
 */
public class SubseqArrayList {
    public static void main(String[] args) {
        System.out.println(subseq("", "abc"));
    }
    static ArrayList<String> subseq(String empt, String pattern){
        if(pattern.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(empt);
            return list;
        }
        char check = pattern.charAt(0);
        ArrayList<String> left = subseq(empt + check, pattern.substring(1));
        ArrayList<String> right = subseq(empt, pattern.substring(1));
        left.addAll(right);
        return left;
    }
}




