/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.Absorb;
import frc.robot.commands.ClawElev;
import frc.robot.commands.Elevator;
import frc.robot.commands.Push;
import frc.robot.commands.RobotAscend;
import frc.robot.commands.RobotLand;
import frc.robot.commands.Shoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

  public Joystick joystick;
	public Joystick joygyro;
  public XboxController xboxController;
  public Button elevator;
  public Button clawshoot;
  public Button clawabsorb;
  public Button claw;
  public Button clawpush;
  public DigitalInput pushbutton;
  public Button ascend;
  public Button land;

	public OI() {
    joystick = new Joystick(RobotMap.OI_DRIVER_CONTROLLER);
		joygyro = new Joystick(RobotMap.OI_DRIVER_GYRO);
		xboxController = new XboxController(RobotMap.OI_DRIVER_XBOX);
    pushbutton = new DigitalInput(RobotMap.ELEVATOR_LIMIT);

    elevator = new AnalogJoystickButton(xboxController, 1);
    clawshoot = new JoystickButton(xboxController, 7);
    clawabsorb = new JoystickButton(xboxController, 8);
    clawpush = new JoystickButton(joystick, 3);
    claw = new AnalogJoystickButton(xboxController, 4);
    ascend = new JoystickButton(joystick, 7);
    land = new JoystickButton(joystick, 8);

    elevator.whenPressed(new Elevator());
    clawshoot.whenPressed(new Shoot());
    clawabsorb.whenPressed(new Absorb());
    claw.whenPressed(new ClawElev());
    clawpush.whenReleased(new Push());
    ascend.whenReleased(new RobotAscend());
    land.whenReleased(new RobotLand());
		
	}

	public Joystick getJoystick() {
		return joystick;
	}
	
	public XboxController getXboxController() {
		return xboxController;
	}
	
	public Joystick getAccel() {
		return joygyro;
	}

}
