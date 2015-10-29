package edu.philiprader.frc3781;

import org.usfirst.frc3781.Robot2015.Robot;

import edu.wpi.first.wpilibj.Joystick.AxisType;
import edu.wpi.first.wpilibj.SpeedController;

/**
 * A class that replaces use for the RobotDrive class. This class,
 * coded for the 2015 game Recycle Rush, sets robot speed limits
 * based on the amount of totes are on the robot and at what height
 * they are being held at.
 * 
 * @author philiprader
 *
 */
public class RobotDrive extends edu.wpi.first.wpilibj.RobotDrive {
	
	private boolean _helpEnabled;
	
	public RobotDrive(int leftMotorChannel, int rightMotorChannel) {
		super(leftMotorChannel, rightMotorChannel);
		
		this.initialize();
	}

	public RobotDrive(int frontLeftMotor, int rearLeftMotor,
			int frontRightMotor, int rearRightMotor) {
		super(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		
		this.initialize();
	}

	public RobotDrive(SpeedController leftMotor,
			SpeedController rightMotor) {
		super(leftMotor, rightMotor);
		
		this.initialize();
	}

	public RobotDrive(SpeedController frontLeftMotor,
			SpeedController rearLeftMotor, SpeedController frontRightMotor,
			SpeedController rearRightMotor) {
		super(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		
		this.initialize();
	}
	
	private void initialize()
	{
		//Disable help for now
		this._helpEnabled = false;
	}
	
	/**
	 * Enables speed helping
	 */
	public void enableHelp()
	{
		this._helpEnabled = true;
	}
	/**
	 * Disables speed helping
	 */
	public void disableHelp()
	{
		this._helpEnabled = false;
	}
	/**
	 * Returns whether drive is being helped
	 * @return True if the drive is being helped
	 */
	public boolean isHelpEnabled()
	{
		return this._helpEnabled;
	}
	
	/** Set the speed of the right and left motors, with speed help if help is enabled.
     * This is used once an appropriate drive setup function is called such as
     * twoWheelDrive(). The motors are set to "leftSpeed" and "rightSpeed"
     * and includes flipping the direction of one side for opposing motors.
     * @param leftOutput The speed to send to the left side of the robot.
     * @param rightOutput The speed to send to the right side of the robot.
     */
	@Override
	public void setLeftRightMotorOutputs(double leftOutput, double rightOutput) {
		double processed_leftOutput = leftOutput * 1;
		double processed_rightOutput = rightOutput * 1;
		
		//See if we are helping the drive (only in Teleop)
		if(this.isHelpEnabled() && Robot.instance.isOperatorControl())
		{
			double driveThrottleValue = 1 - ((Robot.oi.driveStick.getAxis(AxisType.kZ) + 1) / 2);
			
			processed_leftOutput *= driveThrottleValue;
			processed_rightOutput *= driveThrottleValue;
		}
		
		super.setLeftRightMotorOutputs(processed_leftOutput, processed_rightOutput);
	}

}
