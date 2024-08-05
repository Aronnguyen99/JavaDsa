/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Nguyen Huy
 */
public class SubseqDuplicates {
    public static void main(String[] args) {
        int[]arr={2,1,2};
        System.out.println(subseqDup(arr));
    }
    static List<List<Integer>> subseqDup (int[]arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            if(i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            int sizeOfOuter = outer.size();
            end = sizeOfOuter-1;
            for (int j = start; j < sizeOfOuter; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
