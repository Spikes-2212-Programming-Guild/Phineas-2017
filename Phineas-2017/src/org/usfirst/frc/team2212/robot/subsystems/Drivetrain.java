package org.usfirst.frc.team2212.robot.subsystems;

import com.spikes2212.genericsubsystems.drivetrains.HolonomicDrivetrain;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.SpeedController;

public class Drivetrain extends HolonomicDrivetrain {

	private SpeedController leftSpeedController, rightSpeedController, rearSpeedController, frontSpeedController;

	public  Drivetrain(SpeedController leftSpeedController, SpeedController rightSpeedController,
			SpeedController rearSpeedController, SpeedController frontSpeedController) {
		this.frontSpeedController=frontSpeedController;
		this.leftSpeedController=leftSpeedController;
		this.rearSpeedController=rearSpeedController;
		this.rightSpeedController=rightSpeedController;
	}

	@Override
	public void holonomicDrive(double speedY, double speedX) {
		tankDrive(speedY, speedY);
		rearSpeedController.setInverted(true);
		rearSpeedController.set(speedX);
		frontSpeedController.set(speedX);
	}

	@Override
	public void setLeft(double speedLeft) {
		leftSpeedController.setInverted(true);
		leftSpeedController.set(speedLeft);
	}

	@Override
	public void setRight(double speedRight) {
		rightSpeedController.set(speedRight);
	}

	@Override
	public PIDSource getLeftPIDSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PIDSource getRightPIDSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
