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

  public JoystickButton joystickX;
  
  public OI() {
    joystickX = new JoystickButton(controllerOne, RobotMap.GamePadButtonX);

    joystickX.toggleWhenPressed(Robot.tankDrive);
    joystickX.toggleWhenPressed(Robot.arcadeDrive);
  }
  
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
  

}
