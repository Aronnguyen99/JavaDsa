/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class BinarySearchRecursion {
    public static void main(String[] args) {
        
    }
    
    static int searching(int[]arr,int target,int s,int e){
         s=0;
         e = arr.length-1;
        
        int mid = s+(e-s)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return searching(arr, target, s, mid-1);
        }
        
        return searching(arr, target, mid+1, e);
    }
}
