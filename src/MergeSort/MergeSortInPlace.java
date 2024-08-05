/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MergeSort;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};
      mergeSortInplaceCode(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInplaceCode(int[]arr, int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSortInplaceCode(arr, s, mid);
        mergeSortInplaceCode(arr, mid, e);
        
        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[]arr,int s,int mid,int e) {
        int[] mix = new int[e-s];
        int i=s;
        int j= mid;
        int k =0;
        while(i<mid && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
                k++;        
            }else{
                mix[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<mid){
            mix[k] = arr[i];
             i++;
             k++;
        }
        
        while(j<e){
            mix[k] = arr[j];
                j++;
                k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]= mix[l];
        }
      
    }
}  