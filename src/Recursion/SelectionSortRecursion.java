/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[]arr={4,3,8,1};
        sort(arr,arr.length-1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(r>c){
            if(arr[c]>arr[max]){
                sort(arr, r, c+1 , c);
            }else{
                sort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max]=arr[r];
            arr[r]=temp;
            sort(arr, r-1, 0, 0);
        }
    }
}
