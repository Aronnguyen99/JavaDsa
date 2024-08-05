/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Interface;

/**
 *
 * @author Nguyen Huy
 */
public class PetrolEngine implements NewEngine {

    @Override
    public void star() {
        System.out.println("Petrol starts");
    }

    @Override
    public void stop() {
        System.out.println("Petrol stops");
    }
}
