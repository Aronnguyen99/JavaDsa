/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class CountZero {
    public static void main(String[] args) {
        //System.out.println(countingZero(3020004, 0));
        System.out.println(1024/10);
    }
   static int countingZero(int n,int count){
       if(n%10==0){
           return countingZero(n/10, count+1);
       }
       if(n%10==n){
           return count;
       }
    return countingZero(n/10, count);   
   }
    
}
