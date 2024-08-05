
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nguyen Huy
 */
public class QuickSort {
    public static void main(String[] args) {
     int []arr={5,4,3,2,1};   
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
     static void sort(int[]arr,int low,int high){
         if(low>=high){
             return;
         }
         int s = low;
         int e = high;
         int mid = s+(e-s)/2;
         int pivot = mid;
         while(s<=e){
             while(arr[s]<arr[pivot]){
                 s++;
             }
              while(arr[e]>arr[pivot]){
                 e--;
             }
              if(s<=e){
                  int temp = arr[s];
                  arr[s] = arr[e]; 
                  arr[e] = temp;
                  s++;
                  e--;
              }
         }
         sort(arr, low,e);
         sort(arr, s, high);
     }       
}
