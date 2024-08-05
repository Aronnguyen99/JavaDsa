/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
public class numWealth {
    public static void main(String[] args) {
        
        int [][] a ={
            {1,5},{3,7},{3,5}
        };
        System.out.println(maximumWealth(a));
        System.out.println(maximumWealthOptimize(a));
    }
      public static int maximumWealth(int[][]accounts){
           ArrayList<Integer> save = new ArrayList();
           
          for(int i =0; i<accounts.length;i++){
              int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+ accounts[i][j];               
            }
            save.add(sum);
           
        }  
          return max(save);
      }
       public static int maximumWealthOptimize(int[][]accounts){
           int res = Integer.MIN_VALUE;
           for(int[]once : accounts){
               int sum = 0;
               for(int twice : once){
                   sum+=twice;
               }
               if(sum>res){
                   res=sum;
               }
           }
           return res;
      }
       public static int max(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int i =1 ; i<arr.size();i++){
            if(arr.get(i)>max){
               max = arr.get(i);
            }
        }
        return max;
    }
}
