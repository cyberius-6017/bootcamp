/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClawElev extends Command {

  public ClawElev() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.claw);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(Robot.m_oi.xboxController.getRawAxis(4)>0){Robot.claw.clawElevator(0.3);}
    else if(Robot.m_oi.xboxController.getRawAxis(4)<0){Robot.claw.clawElevator(-0.3);}
    isFinished();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    if(Robot.m_oi.xboxController.getRawAxis(4)<0.1 && Robot.m_oi.xboxController.getRawAxis(4)>-0.1){return true;}
    else{return false;}
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.claw.clawElevator(0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.claw.clawElevator(0.0);
  }
}
