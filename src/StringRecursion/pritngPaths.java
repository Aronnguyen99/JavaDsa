/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringRecursion;

/**
 *
 * @author Nguyen Huy
 */
public class pritngPaths {
    public static void main(String[] args) {
       // path("", 3, 3);
      // pathOp("", 3, 3);
        pathVeh("", 3, 3);
    }
    
    static void path(String empt, int r, int c){
        if(r==1 && c ==1){
            System.out.println(empt);
            return;
        }
        if(r>1){   
         //empt+= "D";
        path(empt+"D", r-1, c);   
        }else{
        //empt+= "R";
        path(empt+"R", r, c-1);
        }
        if(c>1){   
         //empt+= "R";
        path(empt+"R", r, c-1);      
        }else{
            //empt+="D";
            path(empt+"D", r-1, c);
        }
         
    }
    static void pathOp (String empt, int r, int c){
            if(r==1 && c==1){
                System.out.println(empt);
                return;
            }
            if(r>1){
                pathOp(empt+"D", r-1, c);
            }
            if(c>1){
                pathOp(empt+"R", r, c-1);
            }
    }
        static void pathVeh (String empt, int r, int c){
            if(r==1 && c==1 ){
                System.out.println(empt);
                return;
            }
            if(r>1 && c>1){
                pathVeh(empt+"V", r-1, c-1);
            }
            if(r>1){
                pathVeh(empt+"D", r-1, c);
            }
            if(c>1){
                pathVeh(empt+"R", r, c-1);
            }
    }
}
