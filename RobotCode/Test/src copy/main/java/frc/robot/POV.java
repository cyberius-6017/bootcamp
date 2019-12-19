/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Add your docs here.
 */
public class POV extends Button{
    Joystick joystick;

    POV(Joystick j){
        this.joystick = j;
    }
    public boolean get(){
        if(this.joystick.getPOV()==0 || this.joystick.getPOV()==180){
            return true;
        }
        else{return false;}
    }
}
