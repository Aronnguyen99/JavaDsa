/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class numbersOfSteps {
    public static void main(String[] args) {
        System.out.println(step(14,0));
    }
    static int step (int n,int count){     
        if(n==0){
            return count;
        }
        if(n%2==0){
            return step(n/2,count +1);
        }
        return step(n-1,count+1);
    }
}
