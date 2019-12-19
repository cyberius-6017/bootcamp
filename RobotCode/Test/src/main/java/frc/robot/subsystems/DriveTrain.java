/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/** 
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  
  //the types of motors are sparks right now because "SparkMax NEO" is not yet a valid choice for motors :/ 
  public static CANSparkMax leftMotor_b;
  public static CANSparkMax rightMotor_b;
  public static CANSparkMax leftMotor_f;
  public static CANSparkMax rightMotor_f;

  public SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftMotor_b, leftMotor_f);
  public SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightMotor_b, rightMotor_f);
  DifferentialDrive allMotors = new DifferentialDrive(leftMotors, rightMotors);

  

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
