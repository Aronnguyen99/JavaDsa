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
public class FindingMissingNums {
    public static void main(String[] args) {
        int[]nums={0,3,2,1};
        System.out.println(Search(nums));
    }
    static int Search(int[]nums){
        int i = 0; 
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k){
            return k;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
