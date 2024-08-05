/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class BitwiseUniqueNums {
    public static void main(String[] args) {
        int []arr= {2,2,3,4,5,3,4};
        System.out.println(Uniquenums(arr));
               
    }
    static int Uniquenums(int[]arr){
        int unique = 0;
        for (int i : arr) {
            unique^=i;
        }
        return unique;
    }
}
