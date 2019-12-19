/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Claw extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public Spark clawElev = new Spark(RobotMap.CLAW);
  public VictorSP clawL = new VictorSP(RobotMap.CLAW_LEFT);
  public VictorSP clawR = new VictorSP(RobotMap.CLAW_RIGHT);
  public Servo pusher = new Servo(1);

  public void shootinator(double sR, double sL){

    clawR.set(sR);
    clawL.set(-sL);

  }

  public void clawElevator(double s){

    clawElev.set(s);

  }

  public void push(double l){

    pusher.set(l);

  }

  public double getPiston(){

    return pusher.get();

  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
