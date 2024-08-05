/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathForDSA;

/**
 *
 * @author Nguyen Huy
 */
// GCD --> uoc chung lon nhat
//LCM --> boi chung nho nhat
public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(lcm(9, 18));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    
     static int lcm(int a, int b){
       return a*b / gcd(a, b);
}
}
