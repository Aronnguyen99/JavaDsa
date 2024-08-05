/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackTracking;

/**
 *
 * @author Nguyen Huy
 */
public class Queens {
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        Nqueeen(board, 0);
    }
    static int Nqueeen(boolean [][]board, int r){
          if(r==board.length){
              display(board);
             System.out.println("");
              return 1;
     }   
          int count =0;
          //Placing Queen follow each of rows
          for (int c = 0; c <board.length; c++) {
            if(isSafe(board, r,c)){
                board[r][c] = true;
                count += Nqueeen(board, r+1);
                board[r][c]= false; //==> xoa remark ==> BACKTRACKING (sau khi recursion return)
            }
        }
          return count;
    }

   static void display(boolean[][] board) {
        for (boolean[] arr : board) {
            for (boolean element : arr) {
                if(element){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
                
            }
            System.out.println("");
       }
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        // vi 1 row chi co 1 queen ==> nen khong can check hang ngang
        // Kiem tra hang doc
         for (int i = 0; i <r; i++) {
            if(board[i][c]){
                return false;
            };
        }
         
        // kiem tra hang cheo trai(left Side)
        int left = Math.min(r, c);
        for (int i = 1; i <=left; i++) {
            if(board[r-i][c-i]){
                return false;
            };
        }
        
        // kiem tra hang cheo phai (right side)
        int right = Math.min(r, board.length-c-1);
        for (int i = 1; i <= right; i++) {
            if(board[r-i][c+i]){
                return false;
            };
        }
        return true;
    }
}
