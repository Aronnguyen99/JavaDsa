/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CyclicSort;

/**
 *
 * @author Nguyen Huy
 */
public class FindDuplicateNums {
    public static void main(String[] args) {
        int []nums={1,3,4,2,2};
        int[] nums1 = {3,3,3,3,3,3};
        System.out.println(finding(nums1));
    }
    static int finding(int[]nums){
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
            if(nums[k]-1!=k){
                return nums[k];
            }
            if(nums[k]==nums[k+1]){
                return nums[k];
            }
        }
        return -1;
    }
    
    static int findingOptimize(int[]nums){
        int i=0;
        while(i<nums.length){
            //1 3 4 2 2
            if(nums[i]!=i+1){
                int correct = nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums, correct, i);
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
