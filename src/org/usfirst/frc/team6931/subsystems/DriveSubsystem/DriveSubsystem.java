/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6931.subsystems.DriveSubsystem;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6931.robot.RobotMap;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public final Spark leftfrontmotor;
	public final Spark leftbackmotor;
	public final Spark rightfrontmotor;
	public final Spark rightbackmotor;
	
	DifferentialDrive robotdrive;
	SpeedControllerGroup left;
	SpeedControllerGroup right;
	public DriveSubsystem() {
		rightbackmotor = new Spark(RobotMap.RIGHTMOTOR2);
		rightfrontmotor = new Spark(RobotMap.RIGHTMOTOR1);
		leftbackmotor = new Spark(RobotMap.LEFTMOTOR2);
		leftfrontmotor = new Spark(RobotMap.LEFTMOTOR1);
		
		leftfrontmotor.setInverted(false);
		leftbackmotor.setInverted(false);
		rightfrontmotor.setInverted(true);
		rightbackmotor.setInverted(true);
		
		left = new SpeedControllerGroup(leftbackmotor, leftfrontmotor);
		right = new SpeedControllerGroup(rightfrontmotor, rightbackmotor);

		robotdrive = new DifferentialDrive(left, right);  
		robotdrive.setSafetyEnabled(false);
	}
	
	
	
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new Idle());
		
	}
	public static void acardeDrive(double speed_stick, double turn_stick) {
		
		
	}
}

