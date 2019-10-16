/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.RobotMap;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  private XboxController controllerOne = new XboxController(RobotMap.CONTROLLER_ONE);
  //XboxController controllerTwo = new XboxController(RobotMap.CONTROLLER_TWO);

  public boolean getButtonA() {
		return controllerOne.getRawButton(RobotMap.GamePadButtonA);
  }
  
  public boolean getButtonB() {
		return controllerOne.getRawButton(RobotMap.GamePadButtonB);
  }

  public boolean getButtonX(){
    return controllerOne.getRawButton(RobotMap.GamePadButtonX);
  }

  public double getRightX() {
    double val = controllerOne.getRawAxis(RobotMap.RIGHT_STICK_X);
    if (Math.abs(val)<0.07){
      val = 0;
    }
    return val;
  }

  public double getRightY() {
    double val = controllerOne.getRawAxis(RobotMap.RIGHT_STICK_Y);
    if (Math.abs(val)<0.07){
      val = 0;
    }
    return val;
  }

  public double getLeftY() {
    double val = controllerOne.getRawAxis(RobotMap.LEFT_STICK_Y);
    if (Math.abs(val)<0.07){
      val = 0;
    }
    return val;
  }

  public double getLeftX() {
    double val = controllerOne.getRawAxis(RobotMap.LEFT_STICK_X);
    if (Math.abs(val)<0.07){
      val = 0;
    }
    return val;
  }
  // public double getRightX() {
	// 	double out = controllerOne.getRawAxis(RobotMap.RIGHT_STICK_X.value);
	// 	if(Math.abs(out)<.05) {
	// 		out = 0;
	// 	}
	// 	return out;
  // }

  // public double getRightY() {
	// 	double out = -controllerOne.getRawAxis(RobotMap.RIGHT_STICK_Y.value);
	// 	if(Math.abs(out)<.05) {
	// 		out = 0;
	// 	}
	// 	return out;
  // }
  
	// public double getLeftX() {
	// 	double out = controllerOne.getRawAxis(RobotMap.LEFT_STICK_X.value);
	// 	if(Math.abs(out)<.05) {
	// 		out = 0;
	// 	}
	// 	return out;
  // }
  
	// public double getLeftY() {
	// 	double out = -controllerOne.getRawAxis(RobotMap.LEFT_STICK_Y.value);
	// 	if(Math.abs(out)<.05) {
	// 		out = 0;
	// 	}
	// 	return -out;
	// }


  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
  
}
