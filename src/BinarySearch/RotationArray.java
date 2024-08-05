/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class RotationArray {
    public static void main(String[] args) {
        int[] nums = {3 ,4 ,9 ,1 ,4 ,5 ,6 ,7, 8};
        System.out.println(findPivot(nums));
        System.out.println(findRotation(nums, 0));
    }
    
    public static int findRotation(int[]nums,int target){
        int pivot = findPivot(nums);
        if(pivot==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        
               if(nums[pivot]==target){
                   return pivot;
               }
               if(target>=nums[0]){
                   return binarySearch(nums, target, 0, pivot);
               }
        return binarySearch(nums, target,pivot+1, nums.length-1);
    }
    
    public static int findPivot(int []nums){
        int s=0;
        int e = nums.length-1;
        while(s<=e){
            // 4,5,6,7,0,1,2,3
            //5
            int mid = s +(e-s)/2;
            if(mid<e &&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>s && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[s]>nums[mid]){
                e=mid-1;
            }
            if(nums[s]<=nums[mid]){
                s=mid+1;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int []nums, int target,int s, int e){
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                e=mid-1;
            }
            if(nums[mid]<target){
                s=mid+1;
            }
        }
        return -1;
    }
}
