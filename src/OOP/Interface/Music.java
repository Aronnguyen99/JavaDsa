/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Interface;

/**
 *
 * @author Nguyen Huy
 */
public class Music implements Media{

    @Override
    public void star() {
        System.out.println("Music turns on");
    }

    @Override
    public void stop() {
        System.out.println("Music turns off");
    }
    
}
