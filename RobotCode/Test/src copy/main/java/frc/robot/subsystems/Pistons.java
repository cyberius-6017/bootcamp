/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class Pistons extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Compressor comp = new Compressor();
  Solenoid front = new Solenoid(0);
  Solenoid back = new Solenoid(3);
  
  public Pistons(){

    comp.setClosedLoopControl(true);

  }

  public void AscendF(){

    if(!front.get()){

      front.set(true);

    }
    else if(front.get()){

      front.set(false);
      
  }

}

  public void AscendB(){

    if(!back.get()){

      back.set(true);

    }
    else if(back.get()){

      back.set(false);
      
    }

  }

  public void OffB(){

    back.set(false);

  }

  public void OffF(){

    front.set(false);

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
