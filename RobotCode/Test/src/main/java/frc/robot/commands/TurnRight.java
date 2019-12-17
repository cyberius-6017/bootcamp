package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TurnRight extends Command{
    public TurnRight(){
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

  // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }


    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
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