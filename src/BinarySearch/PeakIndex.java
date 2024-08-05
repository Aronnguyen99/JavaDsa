/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class PeakIndex {
    public static void main(String[] args) {
        int[] nums = {0,10,5,2,1};
        
        System.out.println(findPeak(nums));
    }
    static int findPeak(int[]nums){
        int s = 0;
        int e = nums.length-1;
        while (s<e){
            int mid = s+(e-s)/2;
            if(nums[mid]>nums[mid+1]){
                e=mid;
            }else if(nums[mid]<nums[mid+1]){
                s=mid+1;
            }
        }
        return s;
    }
}
