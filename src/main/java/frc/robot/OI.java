/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import frc.robot.Util.Constants;
import frc.robot.Util.Controller;
import frc.robot.Util.DriverControlls;

/**
 * @author Fernando Matias
 */
public class OI {
    private static final DriverControlls LeftStick = new DriverControlls(Constants.OperatorConstants.kLeftJoystick);
    private static final DriverControlls RightStick = new DriverControlls(Constants.OperatorConstants.kRightJoystick);
    private static final Controller Gamepad = new Controller(Constants.OperatorConstants.kXboxXontroller);

    public void registerControls(){
      
        
    }

    public static double getLeftThrottleInput() {
      return LeftStick.getYAxis();
    }
    public static double getRightThrottleInput() {
      return RightStick.getYAxis(); 
    }
    public static double getLeftSteeringInput() {
      return LeftStick.getXAxis();
    }
    public static double getRightSteeringInput() {
      return RightStick.getXAxis();
    }
    public static double getLeftThrottleInputInverted() {
      return LeftStick.getYAxisInverted();
    }
    public static double getRightThrottleInputInverted() {
      return RightStick.getYAxisInverted();
    }
    public static double getLeftSteeringInputInverted() {
      return LeftStick.getXAxisInverted();
    }
    public static double getRightSteeringInputInverted() {
      return RightStick.getXAxisInverted();
    }

}