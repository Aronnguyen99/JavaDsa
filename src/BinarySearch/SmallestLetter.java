/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearch;

/**
 *
 * @author Nguyen Huy
 */
public class SmallestLetter {
    public static void main(String[] args) {
        char[] letters ={'c','f','j'};
        char target= 'k';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
           
    }
    
    public static char nextGreatestLetter(char[]letters,char target){
        int s=0; 
        int e = letters.length-1;
//        if(target>=e){
//            return letters[s];
//        }
        while(e>=s){
            int mid=s+(e-s)/2;
            if(target>letters[mid]||target == letters[mid]){
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
            return letters[s % letters.length];
    }
}
