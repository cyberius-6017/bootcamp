/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveArcade;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

public double leftSpeed, rightSpeed, kP, kI, kD, kIz, kFF, kMaxO, kMinO, maxRPM;
		public double actualSpeed;

		// Declaration of VictorSP's and initialization.

		CANSparkMax leftS = new CANSparkMax(RobotMap.DRIVETRAIN_LEFT_SPARK, MotorType.kBrushless);
		CANSparkMax rightS = new CANSparkMax(RobotMap.DRIVETRAIN_RIGHT_SPARK, MotorType.kBrushless);
		// VictorSP leftV = new VictorSP(RobotMap.DRIVETRAIN_LEFT_VICTOR);
		// VictorSP rightV = new VictorSP(RobotMap.DRIVETRAIN_RIGHT_VICTOR);


		CANPIDController leftC = leftS.getPIDController();
		CANPIDController rightC = rightS.getPIDController();

		CANEncoder leftE = leftS.getEncoder();
    	CANEncoder rightE = rightS.getEncoder();
    	DifferentialDrive robotDriveS = new DifferentialDrive(leftS, rightS);
		// DifferentialDrive robotDriveV = new DifferentialDrive(leftV, rightV);

		// Joins both motors in both sides. Since they are in a ToughBox they should
		// spin equally. 

		// Joins both motor groups
	
    // Constructor for the Subsystem
		public DriveTrain() {

			kP = 5e-5;
			kI = 1e-6;
			kD = 0;
			kIz = 0;
			kFF = 0;
			kMaxO = 1;
			kMinO = -1;
			maxRPM = 5700;

			leftC.setP(kP);
			leftC.setI(kI);
			leftC.setD(kD);
			leftC.setIZone(kIz);
			leftC.setFF(kFF);
			leftC.setOutputRange(kMinO,kMaxO);

			rightC.setP(kP);
			rightC.setI(kI);
			rightC.setD(kD);
			rightC.setIZone(kIz);
			rightC.setFF(kFF);
			rightC.setOutputRange(kMinO,kMaxO);

		}

		public void arcadeDrive(double moveSpeed, double rotateSpeed) {
			robotDriveS.arcadeDrive(moveSpeed, rotateSpeed);
			//robotDriveV.arcadeDrive(moveSpeed, rotateSpeed);
		}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DriveArcade());
  }
}
