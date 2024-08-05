/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nguyen Huy
 */
public class NumberDisappearedinArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        findDisappearedNums(nums);
    }
    static List<Integer>findDisappearedNums(int[] nums){
        List<Integer> numsDisappaered = new ArrayList<>();
        int i =0;
        while (i<nums.length){
            int correct = nums[i]-1;
            if( nums[i]!=nums[correct] ){
                swap(nums,i,correct);
            }else{
                i++;
            }
            System.out.println(i);
            System.out.println(Arrays.toString(nums));
        }
         for(int k=0;k<nums.length;k++){
                if(k!=nums[k]-1){
                    numsDisappaered.add(k+1);
                }
            }
        return numsDisappaered;
    }
    
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
