// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4914.CurbStomper.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Shooter extends Subsystem {
	
	public static double shootSpeed = 0.775;
	
	// private final Talon shooter = RobotMap.shooter1;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    /**
     * Sets shooter motor(s) to speed, value between 1 and -1
     * 
     * @param speed speed at which to run motor(s)
     */
    public void setSpeed(double speed) {
    	// shooter.set(speed);
    }
    
    /**
     * Stops shooter motor(s)
     */
    public void stop() {
    	setSpeed(0);
    }
    
    public double getSpeed() {
    	// return shooter.getSpeed();
    	return 0;
    }
}
