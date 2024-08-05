/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class RotationCount {
    public static void main(String[] args) {
        int []nums={11,13,15,17};
        int ans = countPivotOptimize(nums);
        System.out.println(ans);
    }
    static int countPivotOptimize(int[] nums){
               int pivot= findPivot(nums);
               System.out.println(pivot);
               return pivot+1;
       }
    
    static int countPivot(int[] nums){
        int pivot = findPivot(nums);
        System.out.println(pivot);
        int count =0;
        for(int i =0;i<=pivot;i++){
            count++;
        }
        return count;
    }
    static int findPivot(int[] nums){
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e&&nums[mid]>nums[mid+1]){
                return mid;
            }
             if(mid>s&&nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]>nums[s]){
                s=mid+1;
            }else{
                e=mid-1;
            }
           
        }
        return -1;
    }
}
