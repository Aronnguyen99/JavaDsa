/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CyclicSort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Huy
 */
public class FindAllDuplicatesinArray {
    public static void main(String[] args) {
        
    }
    
    static List<Integer> finding(int[]nums){
        List<Integer> duplicate = new ArrayList<>();
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
            if(nums[k]!=k+1){
                duplicate.add(nums[k]);
            }
        }
        return duplicate;
    }
    
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
