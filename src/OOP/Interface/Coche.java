/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.Interface;

/**
 *
 * @author Nguyen Huy
 */
public class Coche {
    static NewEngine engine;
    private Media play;
    
    Coche(){
        engine = new PetrolEngine();
        play = new Music();
    }
    
  static  void startEngine(){
        engine.star();
    }
    
   static void stopEngine(){
        engine.stop();
    }
    
       void startMusic(){
        play.star();
    }
    
    void stopMusic(){
        play.stop();
    }
    
    void switchingEngine(){
        engine = new ElectricEngine();
    }
}