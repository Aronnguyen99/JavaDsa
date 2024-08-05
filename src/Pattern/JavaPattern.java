/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pattern;

/**
 *
 * @author Nguyen Huy
 */
// Step 1--> Determine the number of row 
// Step 2--> find the relation between row and column
// Step 3--> Data type
public class JavaPattern {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void pattern2 (int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void pattern3 (int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void pattern4(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }
    
    static void pattern5(int n){
        for(int row =0;row <=2*n-1;row++){
            int numOfColsInRows = row>n ? 2*n-row:row;
         for(int col=0;col<numOfColsInRows;col++){
             System.out.print("*");
         }
            System.out.println("");
        }
    }
    
    static void pattern6(int n){
        for(int row=0;row<n;row++){
            for(int spaces=0;spaces<=n-row;spaces++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    static void pattern7(int n){
        for(int row =0;row<n;row++){
            for(int spaces=1;spaces<=row;spaces++){
                System.out.print("  ");
            }
            for(int col=1;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
    static void pattern17(int n){
        for(int row =1; row<2*n;row++){
             int numOfColsInRows = row>n ? 2*n-row:row;
         for(int spaces=0;spaces<=n-numOfColsInRows;spaces++){
             System.out.print(" ");
         }
         for(int col=numOfColsInRows;col>=1;col--){
             System.out.print(col);
         }
          for(int col=2;col<=numOfColsInRows;col++){
             System.out.print(col);
         }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int row=0;row<2*n;row++){
              int numOfColsInRows = row>n ? 2*n-row:row;
          for(int spaces =0; spaces<n-numOfColsInRows;spaces++){
              System.out.print(" ");
          }
          for(int col=0;col<numOfColsInRows;col++){
              System.out.print("* ");
          }
            System.out.println("");
        }
    }
    
    static void pattern29(int n){
        for(int row=0;row<2*n;row++){
            int noCol= row>n ? 2*n-row:row;
         for(int col=0;col<noCol;col++){
             System.out.print("*");
         }
         for(int spaces=0;spaces<2*(n-noCol);spaces++){
             System.out.print(" ");
         }
         for(int col=0;col<noCol;col++){
             System.out.print("*");
         }
         
            System.out.println();
        }
//        for(int row2=0;row2<2*n;row2++){
//            int noCol2= row2>n ? 2*n-row2:row2;
//         for(int spaces=0;spaces<n-noCol2;spaces++){
//             System.out.print(" ");
//         }
//         for(int col2=0;col2<noCol2;col2++){
//             System.out.print("*");
//         }
//            System.out.println();
//        }
        
    }
    static void pattern30(int n){
           for(int row=0; row<=n;row++){
             
            for(int spaces=0;spaces<n-row;spaces++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){//=> row --> 1
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){ // 2 -->row
                System.out.print(col+" ");
            }
               System.out.println();
           }
     }
    
    static void pattern31(int n){
        int originalN = n;
        n=2*n-2;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
              int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col))  ;
                System.out.print(atEveryIndex+" ");
            }
            System.out.println("");
        }
    }
}
