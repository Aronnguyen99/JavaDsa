/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class BinaryTheory {
    public static void main(String[] args) {
//        int []arr={-1,0,5,8,9,11,13,19,30,56};
        int target = 46;
        int []arr1 = {56,46,20,18,15,9,8,6,3,-1};
        int ans = binarySearch(arr1, target);
//        System.out.println(arr.length);
        System.out.println(ans);
    }
    public static int binarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        boolean isAscending = arr[end]>arr[start];
        while(start<=end){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
        // Define ascending array or descending array
            if(isAscending){
                if(target>arr[mid]){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
            
        }
        return -1;
    }
}
