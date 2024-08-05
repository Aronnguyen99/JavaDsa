/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Huy
 */
public class LinearSearchRecursion {
    public static void main(String[] args) {
        int [] arr={3,2,13,13,9};
        //System.out.println(  linear(arr, 18, 0));
        ArrayList<Integer> list = new ArrayList<>();
        //System.out.println(findAll(arr, 13, 0, list));
        System.out.println(findAllOp(arr, 13, 0));
    }
    static int linear(int[] arr,int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return linear(arr, target, i+1);
    }
    static ArrayList findAll(int[]arr,int target,int i, ArrayList<Integer>list){
           if(i == arr.length){
               return list;
           }
           if(arr[i] == target){
               list.add(i);
           }
         return  findAll(arr, target, i+1, list);
    }
    
    static ArrayList findAllOp(int[]arr,int target,int i){
            ArrayList<Integer> list = new ArrayList<>();
            if(i == arr.length){
               return list;
           }
           if(arr[i] == target){
               list.add(i);
           }
         ArrayList<Integer> ansfromBelow = findAllOp(arr, target, i+1);
         list.addAll(ansfromBelow);
         return list;
    }
}
