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
public class SetMismatch {
    public static void main(String[] args) {
        int[] nums ={1,2,2,4};
        System.out.println(Arrays.toString(misMatch(nums)));
    }
    
    static int[] misMatch(int[] nums){
        int[]match = {-1,-1};
        int i=0;
        while(i<nums.length){
          
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }else{
                 i++;
                    }
        }
        for(int k=0;k<nums.length;k++){
             if(nums[k]==k){
                 match[0] = nums[k];//==> duplicate nums
                 match [1] = k+1; //==> missing nums = index +1;
             }
        }
        return match;
    }
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
