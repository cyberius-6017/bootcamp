/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;
// import java.lang.Math;

public class DriveArcade extends Command {
  double multiplier = 1;
  double rampFactor = 0.0;

  double moveSpeed;
  public DriveArcade() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    if(Robot.m_oi.joystick.getRawButtonReleased(12)){multiplier=multiplier*-1;}
    moveSpeed = -Robot.m_oi.joystick.getY();
    
    //ramp up moveSpeed to max; if joystick released, ramp down to zero
    // if(Math.abs(moveSpeed)>0.1){
    //   rampFactor=rampFactor+0.1;
    //   if (rampFactor>=1){
    //     rampFactor=1;
    //   }
    // } else {
    //   rampFactor=rampFactor-0.1;
    //   if (rampFactor<=0){
    //     rampFactor=0.01;
    //   }
    // }
    

    double speedFactor = Robot.m_oi.joystick.getThrottle();
    speedFactor = (speedFactor+1)/2;//*rampFactor;
		double rotateSpeed = 0.5*Robot.m_oi.joystick.getX();
		moveSpeed = moveSpeed * speedFactor * multiplier;
		rotateSpeed = rotateSpeed * speedFactor;
    Robot.driveTrain.arcadeDrive(moveSpeed, rotateSpeed);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
