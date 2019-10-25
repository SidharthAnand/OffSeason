/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
import frc.robot.Robot;

public class ArcadeDrive extends Command {

  private long counter = 0; 

  public ArcadeDrive() {
    
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    // Left and right
    Robot.driveTrain.setLeftMotors(Robot.oi.getRightX()+Robot.oi.getLeftY());
    Robot.driveTrain.setRightMotors(-Robot.oi.getRightX()+Robot.oi.getLeftY());

    // if (counter % 100 == 0){
    //   System.out.println("Right Joystick X " + Robot.oi.getRightX());
    //   System.out.println("Left Joystick Y " + Robot.oi.getLeftY());
    // }
    
    Robot.oi.joystickX.cancelWhenPressed(Robot.arcadeDrive);
  }

  @Override
  protected boolean isFinished() {
    
    // if(Robot.oi.getButtonX()){ 
    //   Robot.tankDrive.start();
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
      System.out.println("End Arcade Command");

      Robot.tankDrive.start();
      
  }

  @Override
  protected void interrupted() {
    this.end();
  }
}
