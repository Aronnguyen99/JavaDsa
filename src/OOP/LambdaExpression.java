/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Nguyen Huy
 */ 

interface OP{
   public void print();
}
public class LambdaExpression {
    public static void main(String[] args) {
        OP sum = () -> {System.out.println("Sum");};
        sum.print();
    }
}

class test implements OP{
    OP sum;
    test(){
    
    sum = new test();
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}