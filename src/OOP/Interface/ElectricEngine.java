/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Interface;

/**
 *
 * @author Nguyen Huy
 */
public class ElectricEngine implements NewEngine {

    @Override
    public void star() {
        System.out.println("Electric starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric stops");
    }
    
}
