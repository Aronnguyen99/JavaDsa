/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class BitwiseUniqueOppositeNums {
    public static void main(String[] args) {
        int[] arr = {2,-2,3,4,-4};
        System.out.println(Finding(arr));
    }
    static int Finding(int[] arr){
        int uni = 0;
        for (int i : arr) {
            uni+=i;
        }
        return uni;
    }
}
