/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static final int INTAKE_MOTOR = 35;

  public static final int RIGHT_MOTOR_1 = 31;
  public static final int RIGHT_MOTOR_2 = 32;
  public static final int RIGHT_MOTOR_3 = 39;
  public static final int LEFT_MOTOR_1 = 36;
  public static final int LEFT_MOTOR_2 = 44;
  public static final int LEFT_MOTOR_3 = 34;

  public static final int LEFT_STICK_X = 0;
  public static final int LEFT_STICK_Y = 1;
  public static final int RIGHT_STICK_X = 4;
  public static final int RIGHT_STICK_Y = 5;
  
  public static final int CONTROLLER_ONE = 0;
  //public static final int CONTROLLER_TWO = 0; 

  public static final int GamePadButtonX = 3;
  public static final int GamePadButtonB = 2;
  public static final int GamePadButtonA = 1;

  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;



}