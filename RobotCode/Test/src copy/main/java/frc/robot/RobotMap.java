/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static final int DRIVETRAIN_RIGHT_SPARK = 11;
  public static final int DRIVETRAIN_LEFT_SPARK = 10;
  //public static final int DRIVETRAIN_RIGHT_VICTOR = 8;
  //public static final int DRIVETRAIN_LEFT_VICTOR = 9;
  public static final int ELEVATOR = 7;
  public static final int CLAW = 2;
  public static final int CLAW_LEFT = 8;
  public static final int CLAW_RIGHT = 9;
  public static final int PUSHER = 0;
  
	//Camera
	public static final int frontCam = 1;
	public static final int backCam = 0;
	
	//Joystick and Controllers
  public static final int OI_DRIVER_CONTROLLER = 0;
	public static final int OI_DRIVER_XBOX = 2;
	public static final int OI_DRIVER_GYRO = 3;
	public static final int JOYSTICK_MOVE_AXIS = 1;
	public static final int JOYSTICK_ROTATE_AXIS = 0;
	public static final int JOYSTICK_THROTTLE = 2;
	
	public static final int PULL_BALL = 1;
	public static final int THROW_BALL = 2;
	
	//Servos
  public static final int X_SERVO = 6;
	public static final int Y_SERVO = 5;

	//Pushbuttons
	public static final int ELEVATOR_LIMIT = 0;
	

}
