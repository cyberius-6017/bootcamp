/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveCamera extends Command {
	public DriveCamera() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveServo);
  }

// Called just before this Command runs the first time
  protected void initialize() {
    Robot.driveServo.camDrive(0.0,0.5 );
    
  }

// Called repeatedly when this Command is scheduled to run
  protected void execute() {
  
    //double xJoy = (Robot.m_oi.joygyro.getX()+1)/2;
    
    double xJoy = (Robot.m_oi.joygyro.getX());//+1)/2;
    double yJoy = (Robot.m_oi.joygyro.getY());//+1)/2;
  
    Robot.driveServo.camDrive(xJoy, yJoy);
  
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  protected void end() {
    Robot.driveServo.camDrive(0.0, 0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
    end();
  }
}
