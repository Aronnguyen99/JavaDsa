/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Huy
 */
public class IterativeProgramming {
    public static void main(String[] args) {
//        List<List<Integer>>outer = new ArrayList<>(); 
//        outer.add(new ArrayList<>());
//        int []arr= {1,2,3};
//        for (int num : arr) {
//            int sizeOfOuter = outer.size();
//            for (int i = 0; i < sizeOfOuter; i++) {
//              List<Integer> inner = new ArrayList<>(outer.get(i));//--> truyen vao constructor --> copy arrayList
//              inner.add(num);
//              outer.add(inner);
//            }
//        }
//         
//         System.out.println(outer.get(0));
    }
    static List<List<Integer>> iteration(int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int sizeOfOuter = outer.size();
            for (int i = 0; i < sizeOfOuter; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));
                //--> ArrayList<>(Collection) --> Copy collection do
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}




