/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BubbleSort;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class BubbleSortCode {
    public static void main(String[] args) {
        int []nums={3,1,6,9,8};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
    static int[] bubbleSort(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<=nums.length-i-1;j++){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }
}
