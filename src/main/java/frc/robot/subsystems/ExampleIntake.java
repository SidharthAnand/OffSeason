/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ExampleIntakeCommand;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ExampleIntake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  private VictorSPX intakeMotor;

  public ExampleIntake(){
    intakeMotor = new VictorSPX(RobotMap.INTAKE_MOTOR);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    
    setDefaultCommand(new ExampleIntakeCommand());
  }

  public void inputCargo(double speed){
    intakeMotor.set(ControlMode.PercentOutput, speed);

  }

  public void outputCargo(double speed){
    intakeMotor.set(ControlMode.PercentOutput, -speed);

  }



}
