/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

/**
 *
 * @author Nguyen Huy
 */
public class MazeWithObsatcles {
    public static void main(String[] args) {
        boolean[][]obs = {
            {true,true,true},
            {true,false,true},
            {true, true,true}
        };
        mazeObsta("", 0, 0, obs);
    }
    static void mazeObsta(String empt,int r, int c, boolean maze[][]){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(empt);
            return;
        }
        if(!maze[c][r]){
            return;
        }
        if(r<maze.length-1){
            mazeObsta(empt+"D", r+1, c, maze);
        }
        if(c<maze[0].length-1){
            mazeObsta(empt+"R", r, c+1, maze);
        }
    }
}
