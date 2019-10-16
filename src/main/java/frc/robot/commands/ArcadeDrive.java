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

  public ArcadeDrive() {
    requires(Robot.driveTrain);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    // Left and right
    Robot.driveTrain.setRightMotors(Robot.oi.getRightX());
    Robot.driveTrain.setLeftMotors(-Robot.oi.getRightX());

    // Front and Back
    Robot.driveTrain.setLeftMotors(Robot.oi.getLeftY());
    Robot.driveTrain.setRightMotors(Robot.oi.getLeftY());

    if (Robot.oi.getButtonX()){
      Robot.driveTrain.isArcade = !Robot.driveTrain.isArcade;
    }
  }

  @Override
  protected boolean isFinished() {
    return !Robot.driveTrain.isArcade;
  
  }

  @Override
  protected void end() {
      Robot.driveTrain.setLeftMotors(0);
      Robot.driveTrain.setRightMotors(0);

      System.out.println("End Arcade Command");
  }

  @Override
  protected void interrupted() {
    this.end();
  }
}
