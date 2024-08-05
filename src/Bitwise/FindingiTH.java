/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bitwise;

/**
 *
 * @author Nguyen Huy
 */

//--> Create mask --> use XOR + left shift
public class FindingiTH {
    public static void main(String[] args) {
        System.out.println(Finding(10,3));
    }
    
    static int Finding(int n,int ith){
        return (n&(1<<ith-1))>>(ith-1);
    }
}
