/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Nguyen Huy
 */
public class CheckAmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(chekcAmstrongNum(n)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
//         chekcAmstrongNum(153);
    }
    public static boolean chekcAmstrongNum(int n){
        int original = n;
        int dem = 0;
        int sum=0;
        while(n>0){
           n = n/10;
           dem++;
       }
        n = original;
        //System.out.println(dem);
        while(original>0){
            int du = original%10;
            original=original/10;
            sum = sum +(int) Math.pow(du, dem);
        }
          //System.out.println(sum);
          //System.out.println(n);
        
        return sum == n;
    }
}
