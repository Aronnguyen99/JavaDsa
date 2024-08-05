/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class BinarySearch2D {
    public static void main(String[] args) {
        int[][]nums= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target= 29;
        System.out.println(Arrays.toString(search2D(nums, target)));
    }
    static int[] search2D(int[][] num, int target){
        int r = 0;
        int c = num[r].length-1;
        
        while(r<num.length && c>0){
            if(target<num[r][c]){
                c--;
            }else{
                r++;
            }
            if(target == num[r][c]){
                return new int[]{r,c};
            }
        }
        return new int []{-1,-1};
    }
}
