/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class TankDrive extends Command {

  public TankDrive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.driveTrain.setLeftMotors(Robot.oi.getLeftY());
    Robot.driveTrain.setRightMotors(Robot.oi.getRightY());
    SmartDashboard.putString("Command active", " Tank Drive");

    //Robot.oi.joystickX.cancelWhenPressed(this);


  }

  @Override
  protected boolean isFinished() {
    // if(Robot.oi.getButtonX()){ 
    //   Robot.arcdeDrive.start();
    //   return true;
    // }
    // else{
    //   return false;
    // }

    return false;
  }

  @Override
  protected void end() {
      Robot.driveTrain.setLeftMotors(0);
      Robot.driveTrain.setRightMotors(0);
      System.out.println("End Tank Drive Command");

      //Robot.arcadeDrive.start();
      
      

  }

  @Override
  protected void interrupted() {
    this.end();
  }
}
