/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peter
 */
public class GarageDoorOpenCommand implements Command{

  GarageDoor garageDoor;
   public GarageDoorOpenCommand(GarageDoor garageDoor){
       this.garageDoor=garageDoor;
   }
    public void execute() {
        garageDoor.up();
    }
    
}
