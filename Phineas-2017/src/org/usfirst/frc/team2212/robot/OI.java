package org.usfirst.frc.team2212.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2212.robot.commands.ExampleCommand;

import com.spikes2212.genericsubsystems.drivetrains.commands.DriveArcade;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI /*GEVALD*/ {
	private Joystick leftJoystick = new Joystick(0);
	private Joystick rightJoystick = new Joystick(1);
	
	public OI(){
		JoystickButton arcadeControl = new JoystickButton(rightJoystick, 0);
		
		arcadeControl.whileHeld(new DriveArcade(Robot.drivetrain, this::getX, this::getRotation));
	}
	
	public double getY(){
		return rightJoystick.getY();
	}
	
	public double getX(){
		return leftJoystick.getX();
	}
	
	public double getRotation(){
		return leftJoystick.getX();
	}
}
