/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class Insertion {
    public static void main(String[] args) {
//        int[] arr={1};
//        int target = 1;
//        System.out.println(insert(arr, target));
System.out.println(isPerectSqrt(14));
       
    }
    static int insert(int[]arr,int target){
        int s= 0;
        int e= arr.length-1;
        while(s<e){
            int mid = s+(e-s)/2;
            
            if(target==arr[mid]){
                  return mid;
            }
            
            if(target>arr[mid]){
                s=mid+1;
            }
            
            if(target<arr[mid]){
                e=mid-1;
            }
        }
        
        if(target<arr[s]|| target==arr[s]){
            return s;
        }else{
            return s+1;
        }
    }
    
    static boolean isPerectSqrt(int num){
        if(num<2){
            return true;
        }
        for (int i = 2; i < num; i++) {
            if(Math.pow(i,2)==num){
                return true;
            }
        }
        return false;
    }
}
