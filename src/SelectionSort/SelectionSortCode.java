/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SelectionSort;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class SelectionSortCode {
    public static void main(String[] args) {
        int[]nums = {3,1,2,4};
        System.out.println(Arrays.toString(selectionSort(nums)));
    }
    
    static int[]selectionSort(int []nums){
        for(int i=0;i<nums.length;i++){
            int lastIndex = nums.length-i-1;
            int max = findingPositionofMaxElement(nums,0,lastIndex);
            swapPosition(nums,max,lastIndex);
        }
        return nums;
    }

     static int findingPositionofMaxElement(int[] nums,int start,int end) {
       int max=start;
         for (int i = start; i <= end; i++) {
             if(nums[max]<nums[i]){
                 max=i;
             }
         }
         return max;
    }

    private static void swapPosition(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
}