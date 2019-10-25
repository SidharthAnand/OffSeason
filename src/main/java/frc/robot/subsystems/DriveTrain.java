/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;
import frc.robot.commands.ArcadeDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  private TalonSRX leftMotor1;
  private VictorSPX leftMotor2;
  private VictorSPX leftMotor3;
  private TalonSRX rightMotor1;
  private VictorSPX rightMotor2;
  private VictorSPX rightMotor3;

  public boolean isArcade = true;

  public DriveTrain(){
    leftMotor1 = new TalonSRX(RobotMap.LEFT_MOTOR_1);
    leftMotor2 = new VictorSPX(RobotMap.LEFT_MOTOR_2);
    leftMotor3 = new VictorSPX(RobotMap.LEFT_MOTOR_3);
    rightMotor1 = new TalonSRX(RobotMap.RIGHT_MOTOR_1);
    rightMotor2 = new VictorSPX(RobotMap.RIGHT_MOTOR_2);
    rightMotor3 = new VictorSPX(RobotMap.RIGHT_MOTOR_3);

    leftMotor1.setInverted(true);
    leftMotor2.setInverted(true);
    leftMotor3.setInverted(true);

  }

  @Override
  public void initDefaultCommand() {

    //setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed){
    leftMotor1.set(ControlMode.PercentOutput, speed*0.5);
    leftMotor2.set(ControlMode.PercentOutput, speed*0.5);
    leftMotor3.set(ControlMode.PercentOutput, speed*0.5);

  }

  public void setRightMotors(double speed){
    rightMotor1.set(ControlMode.PercentOutput, speed*0.5);
    rightMotor2.set(ControlMode.PercentOutput, speed*0.5);
    rightMotor3.set(ControlMode.PercentOutput, speed*0.5);

  }



}
