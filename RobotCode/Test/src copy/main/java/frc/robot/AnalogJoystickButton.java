/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 * Add your docs here.
 */
public class AnalogJoystickButton extends Button{

    double thresh=0.5;
    Joystick joystick;
    XboxController xbox;
    int axis;

    AnalogJoystickButton(Joystick j, int a){

        this.joystick=j;
        this.axis=a;

    }

    AnalogJoystickButton(Joystick j, int a, double th){

        this.joystick=j;
        this.axis=a;
        this.thresh=th;

    }

    AnalogJoystickButton(XboxController j, int a){

        this.xbox=j;
        this.axis=a;

    }

    AnalogJoystickButton(XboxController j, int a, double th){

        this.xbox=j;
        this.axis=a;
        this.thresh=th;

    }

    public boolean get(){

        if(this.joystick != null){
            if(this.joystick.getRawAxis(this.axis) > this.thresh || this.joystick.getRawAxis(this.axis) < -this.thresh){

                return true;

            }

            else{return false;}

        }

        else{
            if(this.xbox.getRawAxis(this.axis) > this.thresh || this.xbox.getRawAxis(this.axis) < -this.thresh){

            return true;

        }

        else{return false;}

        }

    }
}
