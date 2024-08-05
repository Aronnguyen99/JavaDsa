/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InsertionSort;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class InsertionSortCode {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(Arrays.toString(insertionSort(nums)));
    }
    static int[] insertionSort(int[]nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }
        }
        return nums;
    }

    private static void swap(int[] nums,int a, int b) {
            int temp = nums[a];
            nums[a]=nums[b];
            nums[b] = temp;
    }
}
