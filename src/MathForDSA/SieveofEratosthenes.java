/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MathForDSA;

/**
 *
 * @author Nguyen Huy
 */
public class SieveofEratosthenes {
    public static void main(String[] args) {
        int n =40;
        boolean[] prime = new boolean[n+1];
        sieve(n,prime);
    }
    static void sieve(int n ,boolean[] prime){
        for (int i = 2; i*i <=n; i++) {
            if(!prime[i]){
                for (int j = i*i; j <= n; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <=n; i++) {
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}
