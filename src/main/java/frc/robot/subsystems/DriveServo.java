/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCamera;

/**
 * Add your docs here.
 */
public class DriveServo extends Subsystem {
  // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public static Servo xServo = new Servo(RobotMap.X_SERVO);
	public static Servo yServo = new Servo(RobotMap.Y_SERVO);
	public static CameraDrive camGroup = new CameraDrive(xServo, yServo);
	
	public DriveServo() {};
	
	public void camDrive(double xJoy, double yJoy) {
		
    camGroup.camDrive(xJoy, yJoy);
    SmartDashboard.putNumber("x", xJoy);
    SmartDashboard.putNumber("y", yJoy);
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveCamera());
    }
}
