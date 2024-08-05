/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class findInMountainArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,5,4,3,2,1};
//        int[]nums2={2,3,4,5,6,7};
        int target= 5;
//        System.out.println(oraganisticArr(nums2, target, 0, nums2.length-1));
//        System.out.println(findPeak(nums));

          System.out.println(findMountArray(nums, target));
//        System.out.println(mountArray(nums, target));
    }
    
//    static int mountArray(int []nums, int target){
////        mountArray.indexArray(target);
//        int s=0;
//        int e= nums.length -1;
//        int ans =-1;
//        while(s<=e){
//            int mid = s+(e-s)/2;
////            System.out.println(nums[mid]);
//            if(target < nums[mid]){
//                e=mid-1;
//            }else if(target > nums[mid]){
//                s=mid+1;
//            }else{
//                ans =mid;
//                e=mid-1;
//            }
//        }
//        return ans;
//    }
    static int findMountArray(int[]nums,int target){
        int peak = findPeak(nums);
        int firstTry = oraganisticArr(nums, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return oraganisticArr(nums, target, peak+1,nums.length-1);
    }
    
    static int findPeak(int[] nums){
        int s=0;
        int e= nums.length -1;
        while(s<e){
            int mid = s+(e-s)/2;
//            System.out.println(mid);
            if(nums[mid]>nums[mid+1]){
                e=mid;
            }else if(nums[mid]<nums[mid+1]){
                s=mid+1;
            }
        }
        return s;
    }

    
    static int oraganisticArr(int[]nums,int target,int s,int e){
        boolean decreasingArr = nums[s]>nums[e];
        while(s<=e){
          int mid = s+(e-s)/2;
//            System.out.println(mid);
          if(target==nums[mid]){
              return mid;
          }
          if(decreasingArr){
              //10,9,8,7,6
              if(target>nums[mid]){
                  e=mid-1;
              }else{
                  s=mid+1;
              }
          }else{
              //1,2,3,4,5
               if(target>nums[mid]){
                  s=mid+1;
              }else{
                  e=mid-1;
              }
          }
        }
        return -1;
    }
}

