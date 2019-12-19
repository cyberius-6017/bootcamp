/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class Elevator extends Command {

  public Elevator() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveElevator);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize(){
  }

  // Called repeatedly when this Command is scheduleds to run
  @Override
  protected void execute() {

    if(!Robot.m_oi.pushbutton.get() || Robot.m_oi.xboxController.getRawAxis(1)>0.2){
      Robot.driveElevator.elevate(-Robot.m_oi.xboxController.getRawAxis(1));
    }
    else if(Robot.m_oi.pushbutton.get() && Robot.m_oi.xboxController.getRawAxis(1)<0.2){
      Robot.driveElevator.elevate(0);
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if(Robot.m_oi.xboxController.getRawAxis(1)<=0.2 && Robot.m_oi.xboxController.getRawAxis(1)>=-0.2){
        return true;
    }
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.driveElevator.elevate(0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
