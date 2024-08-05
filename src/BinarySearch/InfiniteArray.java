/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class InfiniteArray {
    public static void main(String[] args) {
//         int []nums = new int [30];
//       nums = {2,3,5,6,7,8,10,11,12,15,20,23,30};
            int []nums = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        int ans = findIndexInfiniteArray(nums, target);
        System.out.println(ans);
    }
    
    public static int findIndexInfiniteArray(int[]nums, int target){
        int start = 0;
        int end = start +1;
//        int length = end - start + 1;
        while(target>nums[end]){
            int newStart = end + 1;//2 6
            end = end + (end -start +1)*2;//5 13 5 +(5-2+1)
            start = newStart;//2 6
//            length = end - start + 1 ;
//            System.out.println(end);
        }
        
        return binarySearch(nums, target,start, end);
    }
    
    public static int binarySearch(int[]nums, int target,int start, int end){
        while(end >= start){
          int  mid = start + (end-start)/2;
            if(target>nums[mid]){
                start = mid +1;
            }else if(target<nums[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}



