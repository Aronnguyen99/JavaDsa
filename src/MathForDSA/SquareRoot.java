/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathForDSA;

/**
 *
 * @author Nguyen Huy
 */
//n --> so khai ca 
// p --> so lan cac chu so thap phan phia sau
public class SquareRoot {
    public static void main(String[] args) {
        int n=40;
        int p =3;
        System.out.println(sqrt(n, p));
    }
    static double sqrt(int n, int p){
        int s=0; 
        int e=n; 
        double root =0.0;
        while(e>=s){
            int mid = s+(e-s)/2;
            if(mid*mid==n){
                root=mid;
            }
            if(mid*mid<n){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
