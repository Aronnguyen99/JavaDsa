/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CyclicSort;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class CyclicSortCode {
    public static void main(String[] args) {
        int[]nums={3,5,2,1,4};
        
        System.out.println(Arrays.toString(Search(nums)));
    }
    static int[] Search(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        return nums;
    }

     static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
