/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class MinMax {
    public static void main(String[] args) {
//        int[] arr ={3,4,1,7,0,2,19,8,-2};
//        int ans = min(arr);
//        int ans1 = max(arr);
//        System.out.println(ans);
//        System.out.println(ans1);
           int [][]arr2D ={
               {1,2,3},{5,6,7},{8,9,10,11}
           };
          
//           
//        System.out.println(Arrays.toString(search(arr2D, 2)));
        System.out.println(dem(123));
    }
    public static int min(int[]arr){
        int min = arr[0];
        for(int i =1 ; i<arr.length;i++){
            if(arr[i]<min){
               min = arr[i];
            }
        }
        return min;
    }
    
      public static int max(int[]arr){
        int max = arr[0];
        for(int i =1 ; i<arr.length;i++){
            if(arr[i]>max){
               max = arr[i];
            }
        }
        return max;
    }
     public static int[] search(int[][]arr2D,int target){
            for(int i =0;i<arr2D.length;i++){
                for(int j=0;j<arr2D[i].length;j++){
                if(arr2D[i][j] == target){
                    return new int[]{i,j};
                }
                }
            }
            return new int[]{-1,-1};
     }
     
     public static int dem(int a){
         int dem = 0; 
         while(a>0){
             //int du = a%10;
             a=a/10;
             dem++;
          
         }
         return dem;
     }
}
