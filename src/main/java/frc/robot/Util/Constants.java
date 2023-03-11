// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Util;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kLeftJoystick = 0;
    public static final int kRightJoystick = 1;
    public static final int kXboxXontroller = 2;
  }

  public static class PnumaticConstants{
    public static final int kZero = 0;
  }

  public static class MotorConstants{
    public static final int kDriveRightFront = 0;
    public static final int kDriveRightBack = 0;
    public static final int kDriveLeftFront = 0;
    public static final int kDriveLeftBack = 0;

    //Varibles for Turning on Drivetrain
    public static double kTurnrateCurve = 0.1;
    public static double kTurnrateLimit = 0.8;

    //Timeout for Encoders 10 milli
    public static final int kTimeoutms = 10;
    
    //pnuematics on driveTrain
    public static final int highGear = 0;
    public static final int lowGear = 1;
    public static int currentGear = highGear;
  }

  //yes just yes (easier this way)
  public static final boolean On = true;
  public static final boolean Off = false;

  
}
