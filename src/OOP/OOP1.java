/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Nguyen Huy
 */
public class OOP1 {
    static int a = 4;
    static int b = a*2 ;
    static {
        System.out.println("Block Static");
       // b=a*5;
        //a= b-20;
    }

    public static void main(String[] args) {
//        Student std1 = new Student(15,"Huy",77.6f);
          
//        Student std2 = new Student();
//        System.out.println(std1.roll);
//        System.out.println(std1.name);
//        System.out.println(std1.marks);
//        
//        System.out.println(Human.nombre);
        
//        for (int i = 0; i < 3; i++) {
//            swap(i, i+1);
//            System.out.println(i);
//        }
        Person p2 = new Person("Brown","Hieu",16,"VietNam");
       p2.speak();

        Person p1 = new Person("White", "Huy",25, "USA");
        System.out.println(p1.nationality);
    }
   
    
}

class Human{
    String name;
    int age; 
    final String nationality; 
    
    Human(String name, int age){
        this.name = name;
        this.age = age;
        nationality = "VietNam";
    }
    
    void speak (){
        System.out.println("acasc");
    }
    
}

 class Person extends Human{
    String colorSkin;

    public Person(String colorSkin, String name, int age, String nationality) {
        super(name, age);
        this.colorSkin = colorSkin;
    }
    
}

class Student {
    int roll;
    String name;
    float marks;
    
    Student(){
       
    }
    
    Student (int rollNo, String nombre, float mark){
        roll = rollNo;
        name = nombre;
        marks = mark;
    }
}
