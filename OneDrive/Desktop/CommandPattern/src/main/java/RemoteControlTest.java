/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class RemoteControlTest {
    
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        
        GarageDoor garageDoor = new GarageDoor();        
        
    }
}
