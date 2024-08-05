/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class CeilingNum {
    public static void main(String[] args) {
        int[]arr={2,3,8,9,14,16,18};
        int target=15;
        int ans= findingCeilingNum(arr, target);
        System.out.println(ans);
    }
    
    public static int findingCeilingNum(int[]num,int target){
        int s = 0; 
        int e = num.length -1;
        while(e>=s){
        int mid = s+(e-s)/2;
        if(num[mid]<target){
            s=mid+1;
        }else if(num[mid]>target){
            e=mid-1;
        }else{
            return mid;
        }
        }
     return num[s];
    }
}
