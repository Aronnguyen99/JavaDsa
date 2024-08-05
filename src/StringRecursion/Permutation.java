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
public class Permutation {
    public static void main(String[] args) {
        String str= "abc";
        //permutation("", str);
       // System.out.println(permutationRet("", str));
        System.out.println(countPermutation("", str));

        
    }
    
    static void permutation(String empt, String pattern){
        if(pattern.isEmpty()){
            System.out.println(empt);
            return;
        }
        char check = pattern.charAt(0);
        for (int i = 0; i <= empt.length(); i++) {
        // empt=  empt.substring(0,i)+check+empt.substring(i, empt.length());
        //--> se lam update bien empt trong funct ma recursion tra v
        String f = empt.substring(0,i);
        String l = empt.substring(i,empt.length());
         permutation(f+check+l, pattern.substring(1));
        }
    }
    
    static ArrayList permutationRet(String empt,String pattern){
        if(pattern.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(empt);
            return list;
        }
        //ArrayList<String> save = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        char check = pattern.charAt(0);
        for (int i = 0; i <= empt.length(); i++) {
            String f = empt.substring(0, i);
            String l = empt.substring(i, empt.length());
            ans.addAll(permutationRet(f+check+l, pattern.substring(1))) ;
            //ans.addAll(save);
        }
        
        return ans;
    }
   
    static int countPermutation(String empt, String pattern){
        if(pattern.isEmpty()){
              return 1;
        }
        int count =0;
        char check = pattern.charAt(0);
        for (int i = 0; i <= empt.length(); i++) {
            String f = empt.substring(0, i);
            String l = empt.substring(i, empt.length());
            count = count +countPermutation(f+check+l, pattern.substring(1));
        }
        return count;
    }
}
