// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3781.Robot2015.subsystems;

import org.usfirst.frc3781.Robot2015.RobotMap;
import org.usfirst.frc3781.Robot2015.commands.*;

import edu.philiprader.frc3781.RobotDrive;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;


/**
 *
 */
public class DriveBase extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController leftMotors = RobotMap.driveBaseLeftMotors;
    SpeedController rightMotors = RobotMap.driveBaseRightMotors;
    RobotDrive robotDrive = RobotMap.driveBaseRobotDrive;
    Gyro mainGyro = RobotMap.driveBaseMainGyro;
    AnalogInput mainUltrasonicSensor = RobotMap.driveBaseMainUltrasonicSensor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    BuiltInAccelerometer mainAccelerometer = RobotMap.driveBaseMainAccelerometer;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void drive (double speedL, double speedR)
    {
    	this.robotDrive.drive(speedL, speedR);
    }
    public void drive (Joystick joystick)
    {
    	this.robotDrive.arcadeDrive(joystick.getY(), joystick.getX());
    }
    
    public void enableDriveHelp()
    {
    	this.robotDrive.enableHelp();
    }
    public void disableDriveHelp()
    {
    	this.robotDrive.disableHelp();
    }
    public boolean isDriveHelpEnabled()
    {
    	return this.robotDrive.isHelpEnabled();
    }
    
    public Gyro getMainGyro()
    {
    	return this.mainGyro;
    }
    public BuiltInAccelerometer getMainAccelerometer()
    {
    	return this.mainAccelerometer;
    }
    public double getUltrasonicReading()
    {
    	double milliVoltsPerInch = 9.8; //From the Ultrasonic sensor's datasheet, (Vcc / 512) = volts per inch
    	double distanceInInches = ( (this.mainUltrasonicSensor.getVoltage() * 1000) / milliVoltsPerInch);
    	
    	return distanceInInches;
    	//return this.mainUltrasonicSensor.getVoltage();
    }
    public double getUltrasonicVoltage()
    {
    	return this.mainUltrasonicSensor.getVoltage();
    }
    
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new CmdTeleOp());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    }
}
