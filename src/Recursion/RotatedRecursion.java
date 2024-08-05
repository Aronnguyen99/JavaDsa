/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class RotatedRecursion {
    public static void main(String[] args) {
        
    }
    static int rotate(int[] arr, int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<arr[m]){
            if(target>=arr[s]&& target <=arr[m]){
                 return rotate(arr, target, s, m-1);
            }else{
                  return rotate(arr, target, m+1, e);
            }
        }
       if(target>arr[m] && target<=arr[e]){
           return rotate(arr, target, m+1, e);
       } 
       return rotate(arr, target, s, m-1);
    }
}
