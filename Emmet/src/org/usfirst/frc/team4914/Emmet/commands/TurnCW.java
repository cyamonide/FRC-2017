package org.usfirst.frc.team4914.Emmet.commands;

import org.usfirst.frc.team4914.Emmet.Robot;
import org.usfirst.frc.team4914.Emmet.RobotConstants;

import edu.wpi.first.wpilibj.command.PIDCommand;


public class TurnCW extends PIDCommand {

    public TurnCW(int angle) {

    	super("TurnCW", RobotConstants.AUTO_TURN_P, 
    			RobotConstants.AUTO_TURN_I, RobotConstants.AUTO_TURN_D);
    	getPIDController().setSetpoint(angle);
        
    	getPIDController().setInputRange(0, 360);
    	getPIDController().setContinuous(true);
        getPIDController().setAbsoluteTolerance(RobotConstants.AUTO_TURN_TOLERANCE);
        getPIDController().setOutputRange(-0.4, 0.4);
    }

    protected double returnPIDInput() {
    	return Robot.drivetrain.getGyroBearing();
    }

    protected void usePIDOutput(double output) {
    	Robot.drivetrain.tankDrive(-output, output, false, false);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// sets timeout
    	setTimeout(5);
    	// resets all sensors
    	Robot.drivetrain.resetGyro();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() { }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // return getPIDController().onTarget();
    	return getPIDController().onTarget() || isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	getPIDController().disable();
    	getPIDController().free();
    	Robot.drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

}
