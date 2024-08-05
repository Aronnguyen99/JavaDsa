/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathForDSA;

/**
 *
 * @author Nguyen Huy
 */
public class PrimeNums {
    public static void main(String[] args) {
      int n =13;   
        for (int i = 2; i <= n; i++) {
            if(prime(i)){
                System.out.println(i + " ");
            }
            
        }
        
    }
    
    static boolean prime(int n){
        if(n==1){
            return false;
        }
        int c =2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
