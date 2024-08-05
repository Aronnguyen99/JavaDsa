/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class flippingAndInverting {
    public static void main(String[] args) {
        int [][] img = {
            {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}
                   
        };
        
        for (int[] row : img) {
            //System.out.println(Arrays.toString(row));
            for(int i=0;i<(img.length+1)/2;i++){
                //System.out.println(row[img.length-i-1]);
              int temp = row[i];  
              row[i]= row[img.length-i-1];
              row[img.length-i-1] = temp; 
            }
            System.out.println(Arrays.toString(row));
        }
    }
}
