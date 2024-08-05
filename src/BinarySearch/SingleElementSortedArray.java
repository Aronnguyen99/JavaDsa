/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class SingleElementSortedArray {
    public static void main(String[] args) {
        int []nums = {1,1,2,2,3,3,4,5,5,6,6};
        int ans= singleEmlement(nums);
        System.out.println(ans);
    }
    // 1 1 2 2 3 3 4 5 5 6 6 7 7 
    static int singleEmlement(int[]nums){
        int n = nums.length;
        if(n==1){
            return 0;
        }
        if(nums[0]!= nums[1]){
            return 0;
        }
        if(nums[n-1]!=nums[n-2]){
            return n-1;
        }
        int s = nums[1];
        int e = nums[n-2];
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return mid;
            }
            if((mid%2==1 && nums[mid]==nums[mid-1])
                    || (mid%2==0 && nums[mid]==nums[mid+1])){
                s = mid+1;
            }
            
            else {
                e=mid-1;
            }
            
            
        }
        return -1;
    }
}
