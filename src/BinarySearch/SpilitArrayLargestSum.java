/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class SpilitArrayLargestSum {
    public static void main(String[] args) {
       int []nums={2,5,7,10,8};
       int ans = splitArray(nums, 2);
        System.out.println(ans);
    }
    
    static int splitArray(int[]nums, int m){
        int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++){
            s= Math.max(s, nums[i]);
            e+=nums[i];
        }
    
       
        while(s<e){
        
            int mid = s+(e-s)/2;
            //System.out.println(mid+"++");
             int sum=0; 
             int pieces = 1;
            for (int num : nums) {
            if(sum+num>mid){
                sum = num;
                pieces++;
            }else{
                sum+=num;
            }
        }
//             System.out.println(mid+"xx");
//                System.out.println(sum+"++");
//            System.out.println(pieces+"--");   
         
           
        if(pieces>m){
            s=mid+1;
        }else{
            e=mid;
        }
        }
     return e;   
    }
    
    
}
