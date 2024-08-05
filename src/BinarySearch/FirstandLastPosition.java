/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class FirstandLastPosition {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
          
    }
    
    public static int[] searchRange(int[] nums, int target) {
        int [] filter = {-1,-1};
        filter[0]= findPosition(nums, target, true);
        filter[1]= findPosition(nums, target, false);
        return filter;
}
    public static int findPosition(int[]nums,int target, boolean firstPos){
       int s = 0 ; 
       int e = nums.length -1;
       int ans=0;
       while(e>=s){
           int mid = s + (e-s)/2;
           if(target >nums[mid]){
               s=mid +1;
           }else if(target <nums[mid]){
               e=mid-1;
           }else{
               ans = mid;
               if(firstPos){
                   e=mid-1;
               }else{
                   s=mid+1;
               }
           }
       }
       return ans;
    }
}