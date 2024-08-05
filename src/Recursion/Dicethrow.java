/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Huy
 */
public class Dicethrow {
    public static void main(String[] args) {
        //dice("", 4);
        System.out.println(diceRet("", 4));
        System.out.println(countDice("", 4));
    }
    static void dice(String empt, int target){
        if(target==0){
            System.out.println(empt);
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(empt+i, target-i);
        }
    }
        static ArrayList<String> diceRet(String empt, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(empt);
            return list;
        }
        ArrayList<String> save = new ArrayList<>();
        for (int i = 1; i <=6 && i<=target; i++) {
            save.addAll(diceRet(empt+i, target-i));
        }
        return save;
    }
        static int countDice(String empt, int target){
            if(target==0){
                return 1;
            }
            int count =0; 
            for (int i = 1; i <=6 && i<=target; i++) {
                count = count + countDice(empt+i, target-i);
            }
            return count;
        }
}
