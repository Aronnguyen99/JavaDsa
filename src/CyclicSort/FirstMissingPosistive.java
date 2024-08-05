/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CyclicSort;

/**
 *
 * @author Nguyen Huy
 */
public class FirstMissingPosistive {
    public static void main(String[] args) {
        //3 4 -1 1
    }
    static int Searching(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[correct]){
                swap(nums,correct,i);
            }else{
                i++;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1){
                return k+1;
            }
        }
        return nums.length+1;
    }
     private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
