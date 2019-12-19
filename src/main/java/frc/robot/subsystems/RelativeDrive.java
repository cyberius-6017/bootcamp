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
import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Robot;

/**
 * Add your docs here.
 */
public class RelativeDrive {

    VictorSP left;
    VictorSP right;
    CANPIDController lController;
    CANPIDController rController;
    CANEncoder lEnconder;
    CANEncoder rEncoder;

    double kP = 5e-5;
    double kI = 1e-6;
    double kD = 0;
    double kIz = 0;
    double kFF = 0;
    double kMaxO = 1;
    double kMinO = -1;
    double maxRPM = 5700;
    double yaw;
    double rot;
    double x;
    double y;
    boolean rotate;

    public RelativeDrive(CANSparkMax l, CANSparkMax r) {

        this.lController = l.getPIDController();
        this.rController = r.getPIDController();
        this.lEnconder = l.getEncoder();
        this.rEncoder = r.getEncoder();
        init();

    }

    public void init(){

        this.lController.setP(kP);
		this.lController.setI(kI);
		this.lController.setD(kD);
		this.lController.setIZone(kIz);
		this.lController.setFF(kFF);
		this.lController.setOutputRange(kMinO,kMaxO);

        this.rController.setP(kP);
		this.rController.setI(kI);
		this.rController.setD(kD);
		this.rController.setIZone(kIz);
		this.rController.setFF(kFF);
        this.rController.setOutputRange(kMinO,kMaxO);

    }

    public RelativeDrive(VictorSP l, VictorSP r){

        this.left = l;
        this.right = r;

    }

    public void dualDrive(double movespeed, double rotatespeed){

        yaw = Robot.ahrs.getYaw();
        double yawM = ((yaw+180)/(180+180))*(90+90)-90;

        SmartDashboard.putNumber("yawM", yawM);

        x = Robot.m_oi.xboxController.getRawAxis(0);
        y = -Robot.m_oi.xboxController.getRawAxis(1);
        int penis = 2;
        rot = 180*Math.atan(x/y)/Math.PI;

        if(this.lController != null){

            if(movespeed>0.1 || movespeed<0.1){
                this.lController.setReference(movespeed*maxRPM, ControlType.kVelocity);
                this.rController.setReference(-movespeed*maxRPM, ControlType.kVelocity);
            }
            else{
                this.lController.setReference(0, ControlType.kVelocity);
                this.rController.setReference(0, ControlType.kVelocity);
                Robot.ahrs.reset();
            }
            if(yawM>rot+4){
			    this.lController.setReference(movespeed*0.2*maxRPM, ControlType.kVelocity);
            }
            else if(yawM<rot-4){
                this.rController.setReference(-movespeed*0.2*maxRPM, ControlType.kVelocity);
            }

            if(rotatespeed>0.1){
                this.rController.setReference(-movespeed*rotatespeed*maxRPM, ControlType.kVelocity);
                if(!rotate){rotate=true;}
            }
            else if(rotatespeed<-0.1){
                this.lController.setReference(movespeed*rotatespeed*maxRPM, ControlType.kVelocity);
                if(!rotate){rotate=true;}
            }
            else if(rotatespeed>-0.1 && rotatespeed<0.1 && rotate){
                Robot.ahrs.reset();
                rotate=false;
            }
        }

        else if(this.lController == null && this.left != null){

            if(movespeed>0.1 || movespeed<0.1){
                this.left.set(movespeed);
                this.right.set(-movespeed);
            }
            else{
                this.left.set(0);
                this.right.set(0);
                Robot.ahrs.reset();
            }
            if(yawM>rot+4){
			    this.left.set(movespeed*0.2);
            }
            else if(yawM<rot-4){
                this.right.set(-movespeed*0.2);
            }

            if(rotatespeed>0.1){
                this.right.set(-movespeed*rotatespeed);
                if(!rotate){rotate=true;}
            }
            else if(rotatespeed<-0.1){
                this.left.set(movespeed*rotatespeed);
                if(!rotate){rotate=true;}
            }
            else if(rotatespeed>-0.1 && rotatespeed<0.1 && rotate){
                Robot.ahrs.reset();
                rotate=false;
            }
        }
    }
}
