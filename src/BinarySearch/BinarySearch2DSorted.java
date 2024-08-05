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
public class BinarySearch2DSorted {
    public static void main(String[] args) {
        int nums[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        int nums1[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(Search(nums, 10)));
       // System.out.println(nums.length);
        //System.out.println(nums[0].length/2);
        
    }
    
   static int[] binarySearch(int nums[][],int row, int cStart, int cEnd, int target){
            cStart = 0;
            cEnd = nums[row].length-1;
            while(cStart<=cEnd){
                int mid = cStart + (cEnd - cStart)/2;
                if(target == nums[row][mid]){
                    return new int[]{row,mid};
                }
                if(target>nums[row][mid]){
                    cStart= mid +1;
                }else{
                    cEnd=mid-1;
                }
            }
            return new int[]{-1,-1};
   }
   
   static int[] Search(int nums[][],int target){
       int rows = nums.length;
       int cols = nums[0].length-1;
       if(rows==1){
           return binarySearch(nums, 0,0 , cols-1, target);
       }
       
       int rStart = 0;
       int rEnd = rows -1;
       int cMid = cols/2;
       //System.out.println(cols);
       //System.out.println(cMid+"++++");
       //run the loop til 2 rows are remaining
       while(rStart <(rEnd-1)){
           int mid = rStart + (rEnd - rStart)/2;
           //System.out.println(cMid+"---");
           if(target == nums[mid][cMid]){
               System.out.println(cMid+"xxx");
               return new int[]{mid,cMid};
           }
           if(target>nums[mid][cMid]){
               rStart = mid;
           }else{
               rEnd=mid;
           }
       }
       if(target<=nums[rStart][cMid]){
           System.out.println(cMid+"aaa");
           return binarySearch(nums, rStart, 0, cMid, target);
       }
       
       if(target>=nums[rStart][cMid] && target<=(cols-1)){
           System.out.println(cMid+"bbb");
           return binarySearch(nums, rStart, cMid, cols-1, target);
       }
       
       if(target<=nums[rStart+1][cMid]){
           //System.out.println(cMid+"ccc");
            return binarySearch(nums, rStart+1, 0, cMid, target);
       }
       
       if(target>=nums[rStart+1][cMid]){
           System.out.println(cMid+"ddd");
           return binarySearch(nums, rStart+1, cMid, cols-1, target);
       }
       return new int[]{-1,-1};
   }
}
