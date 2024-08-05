/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class RotationArrayDuplicate {
    public static void main(String[] args) {
        
    }
    
    static int search(int []nums,int target){
        int pivot = findPivot(nums);
        if(pivot ==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(target == nums[pivot]){
            return pivot;
        }
        if(target>nums[0]){
            return binarySearch(nums, target, 0, pivot);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    // 2 2 9 2 2 2 2 2
    static int findPivot(int nums[]){
        int s =0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e&&nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>s&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]==nums[s] && nums[mid]==nums[e]){
               if(nums[s]>nums[s+1]){
                   return nums[s];
               }
                s++;
                if(nums[e-1]>nums[e]){
                   return nums[e-1];
               }
                e--;
                //left side is sorted ==> pivot is the right side
            }else if(nums[mid]>nums[s] || (nums[mid]==nums[s]&&nums[mid]>nums[e])){
                    s=mid+1;
            }else{
                    e=mid-1;
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
