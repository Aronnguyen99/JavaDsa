/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

/**
 *
 * @author Nguyen Huy
 */
public class findNumbers {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums ){
        int count=0;
        int dem=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                nums[i]=nums[i]/10;
                dem++;
            }
            if(dem%2==0){
                count++;
            }
        }
        return count;
    }
}
