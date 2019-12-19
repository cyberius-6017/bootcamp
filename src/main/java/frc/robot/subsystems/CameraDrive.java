/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;

/**
 * Add your docs here.
 */
public class CameraDrive {

    Servo xServo;
	Servo yServo;
	
	public CameraDrive(Servo x, Servo y) {
		
		this.xServo = x;
		this.yServo = y;
		
	}
	
	public void camDrive(double x, double y) {

		this.xServo.set(x);
        this.yServo.set(y);

	}

}
