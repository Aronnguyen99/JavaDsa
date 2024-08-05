/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */
public class SetiTHbit {
    public static void main(String[] args) {
        System.out.println(set(86, 4));
    }
    static int set(int n,int ith){
        return ((n|(1<<(ith-1)))&(1<<(ith-1)))>>(ith-1);
    }
}
