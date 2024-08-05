/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackTracking;

import java.util.Arrays;

/**
 *
 * @author Nguyen Huy
 */
//Definition:BackTracking ==> (1)tai moi lan recursion call thi remark su thay doi
//                           + (2)sau khi recursion return thi xoa het remark
public class backTracking {
    public static void main(String[] args) {
        boolean [][]maze1 = {
            {true,true,true},
            {true, true, true},
            {true,true,true}
        };
        
        int [][] path = new int[maze1.length][maze1[0].length];       
        //allPaths("", 0, 0, maze1);
        allPathPrints("", 0, 0, path, maze1, 1);
    }
    static void allPaths(String empt,int r, int c, boolean[][]maze){
         if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(empt);
            return;
        }
         if(!maze[r][c]){
            return;
        }
        //Remark path that is visited
         maze[r][c]=false;//(1)
        if(r<maze.length-1){
            allPaths(empt+"D", r+1, c, maze);
        }
        if(c<maze[0].length-1){
            allPaths(empt+"R", r,c+1, maze);
        }
        if(r>0){
            allPaths(empt+"U", r-1, c, maze);
        }
        if(c>0){
            allPaths(empt+"L", r, c-1, maze);
        }
    // this line is where the function will be over
    // so before the funct get removed, also remove the changes
        maze[r][c] = true;//(2)
    }
    
    static void allPathPrints(String emtp, int r,int c, int[][] path,boolean[][] maze, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
             path[r][c] = step;
             for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
             System.out.println(emtp);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
         path[r][c] = step;
        if(r<maze.length-1){
            allPathPrints(emtp+"D", r+1, c, path, maze, step+1);
        }
        
         if(c<maze[0].length-1){
            allPathPrints(emtp+"R", r, c+1, path, maze, step+1);
        }
         
         if(r>0){
             allPathPrints(emtp+"U", r-1, c, path, maze, step+1);
         } 
         
         if(c>0){
             allPathPrints(emtp+"L", r, c-1, path, maze, step+1);
         }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
