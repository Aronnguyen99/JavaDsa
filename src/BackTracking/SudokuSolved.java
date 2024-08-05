/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackTracking;

/**
 *
 * @author Nguyen Huy
 */
public class SudokuSolved {
    public static void main(String[] args) {
        int[][] board = new int[][]{
            {3,0,6,5,0,8,4,0,0},
            {5,2,0,0,0,0,0,0,0},
            {0,8,7,0,0,0,0,3,1},
            {0,0,3,0,1,0,0,8,0},
            {9,0,0,8,6,3,0,0,5},
            {0,5,0,0,9,0,6,0,0},
            {1,3,0,0,0,0,2,5,0},
            {0,0,0,0,0,0,0,7,4},
            {0,0,5,2,0,6,3,0,0}
        };
      int[][]board1 = new int[][]{
          {6,2,9},
          {0,0,7},
          {5,8,0}
      };
      if(solve(board)){
          display(board);
      }
        
//       if(solveKunal(board)){
//           display(board);
//       }
        
    }
    
    static boolean solve(int[][] board){
        //int n = board.length;      
        for (int row = 0; row <board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if(board[row][col]==0){
                for (int num = 1; num <=9; num++) {
                    if(isSafe(board, row, col, num)){
                        board[row][col] = num;
                        if(solve(board)){
                            return true;
                        }else{
                            board[row][col]=0;
                        }
                    }        
                    }
                return false;//==> Neu khong co num nao phu hop thi khong solve dc
                }
            }
        }
        return true;
    }
    
    static boolean solveKunal(int[][]board){
        int n = board.length;
        int r = -1;
        int c= -1;
        boolean checkEmpt = true;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j]==0){
                    r=i;
                    c=j;
                    checkEmpt = false;
                    break;
                }
            }
           if(checkEmpt==false){
            break;// Neu ma row empty thi break luon, khong can xet col
        }
        }
      if(checkEmpt==true){
          return true; // Neu khong con o nao empt thi sudoku duoc solve
      }
        for (int numTry = 1; numTry <=9; numTry++) {
            if(isSafe(board, r, c, numTry)){
                board[r][c]=numTry;
                if(solveKunal(board)){
                    return true;
                }else{
                      board[r][c]=0;
                }
            }
        }
      return false;// khong giai duoc sudoku
    }
    
    static boolean isSafe(int[][]board, int r, int c,int num){
        // Kiem tra hang ngang xem co num bi trung khong
        for (int i = 0; i < board.length; i++) {
           if(board[r][i]==num){
               return false;
           }
        }
        
        // Kiem tra hang doc xem co num bi trung khong
        for (int i = 0; i < board.length; i++) {
            if(board[i][c]==num){
                return false;
            }
        }
//          for (int[] row : board) {
//              if(row[c]==num){
//                  return false;
//              }
//        }
        
        // Kiem tra co so trung nhau trong o 3x3 khong
        
        int sqrt = (int)(Math.sqrt(board.length));
        int localRow = r - r%sqrt; // ==> vi tri row dau tien trong box 3x3
        int localCol = c - c%sqrt; // ==> vi tri col dau tien trong box 3x3
        
        for (int i = localRow; i < localRow+sqrt; i++) {
            for (int j = localCol; j < localCol+sqrt; j++) {
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        
        return true;
    }

    private static void display(int[][] board) {
          for (int[] row : board) {
              for (int num : row) {
                  System.out.print(num + " " );
              }
              System.out.println("");
        }
    }
}
