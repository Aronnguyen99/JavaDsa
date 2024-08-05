/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Huy
 */
public class LetterCombinationPhoneNums {
    public static void main(String[] args) {
           System.out.println(phonePadRet("", "12"));
           System.out.println(countPhonePad("", "12"));
            
//            ArrayList<Integer> save=new ArrayList<>();
//            for (int i = 0; i < 10; i++) {
//             ArrayList<Integer> list=new ArrayList<>();
//             list.add(i);
//             save = list;
//        }
//            System.out.println(save);
        }
    static void phonePad(String empt, String pattern ){
           if(pattern.isEmpty()){
               System.out.println(empt);
               return;     
           }
           
           int digit = pattern.charAt(0)-'0';//--> convert '2' into 2
           for (int i = (digit-1)*3; i <digit*3 ; i++) {
               char check = (char)('a'+i);
               phonePad(empt+check, pattern.substring(1));
        }
    }
       static List<String> phonePadRet(String empt, String pattern ){
           if(pattern.isEmpty()){
               List<String> list = new ArrayList<>();
               list.add(empt);
               return list;
           }
           List<String> save = new ArrayList<>();
           int digit = pattern.charAt(0)-'0';//--> convert '2' into 2
           for (int i = (digit-1)*3; i <digit*3 ; i++) {
               char check = (char)('a'+i);
              save.addAll(phonePadRet(empt+check, pattern.substring(1))) ;
        }
           return save;
    }
          static int countPhonePad(String empt, String pattern ){
           if(pattern.isEmpty()){
               
               return 1;
           }
           int count =0;
           int digit = pattern.charAt(0)-'0';//--> convert '2' into 2
           for (int i = (digit-1)*3; i <digit*3 ; i++) {
               char check = (char)('a'+i);
              count = count + countPhonePad(empt+check, pattern.substring(1));
        }
           return count;
    }
    
  }
        
   

