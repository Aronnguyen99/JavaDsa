/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author Nguyen Huy
 */
public class SortedArrayRecursion {
    public static void main(String[] args) {
       int[] arr= {1,2,3,4,15,6};
        System.out.println(checkSorted(arr, 0));
    }
    static boolean checkSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && checkSorted(arr,i+1);
    }
}
