package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Util.Constants;
import frc.robot.Util.DefaultFalcon;

public class DriveTrain extends SubsystemBase {
    //https://github.com/Ceyx22/Team-207-master/blob/master/2019.java/src/main/java/frc/robot/subsystems/Drivebase.java

    public static final DriveTrain instance = new DriveTrain();

    public static DefaultFalcon mDriveLeftMaster, mDriveLeftB;
    public static DefaultFalcon mDriveRightMaster, mDriveRightB;
    private static Solenoid mShifter_High, mShifter_Low;

    public double TurnRateCurved;
    public static DifferentialDrive mDrive;

    public static DriveTrain getInstance(){
        return instance;
    }

    public DriveTrain(){
        //Setting both falcons to the default fx script
        mDriveLeftMaster = new DefaultFalcon(Constants.MotorConstants.kDriveLeftFront);
        mDriveLeftB = new DefaultFalcon(Constants.MotorConstants.kDriveLeftBack);

        mDriveRightMaster = new DefaultFalcon(Constants.MotorConstants.kDriveRightFront);
        mDriveRightB = new DefaultFalcon(Constants.MotorConstants.kDriveRightBack);

        //enabling follower mode for the other  two motors
        mDriveLeftB.set(ControlMode.Follower, Constants.MotorConstants.kDriveLeftFront);
        mDriveRightB.set(ControlMode.Follower, Constants.MotorConstants.kDriveRightFront);

        //Left Encoder Values
        mDriveLeftMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, Constants.MotorConstants.kTimeoutms);
        mDriveLeftMaster.setSensorPhase(false);
        mDriveLeftMaster.setInverted(false);
        mDriveLeftB.setInverted(false);

        //Right Encoder Values
        mDriveRightMaster.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, Constants.MotorConstants.kTimeoutms);
        mDriveRightMaster.setSensorPhase(false);
        mDriveRightMaster.setInverted(false);
        mDriveRightB.setInverted(false);
    }
    public void UpShift() {
        mShifter_High.set(Constants.On);
         mShifter_Low.set(Constants.Off);
         Constants.MotorConstants.currentGear = Constants.MotorConstants.highGear;
    }
      
    public void DownShift() {
        mShifter_High.set(Constants.Off);
        mShifter_Low.set(Constants.On);
        Constants.MotorConstants.currentGear = Constants.MotorConstants.lowGear;
    }
        
    public double GetLeftEncoderValue() {
        return mDriveLeftMaster.getSelectedSensorPosition(0);
    }
         
    public double GetRightEncoderValue() {
        return mDriveRightMaster.getSelectedSensorPosition(0);
    }
        
    public void setCoast() {
        mDriveLeftMaster.setNeutralMode(NeutralMode.Coast);
        mDriveLeftB.setNeutralMode(NeutralMode.Coast);
        mDriveRightMaster.setNeutralMode(NeutralMode.Coast);
        mDriveRightB.setNeutralMode(NeutralMode.Coast);
        }
    public void setBrake() {
        mDriveLeftMaster.setNeutralMode(NeutralMode.Brake);
        mDriveLeftB.setNeutralMode(NeutralMode.Brake);
        mDriveRightMaster.setNeutralMode(NeutralMode.Brake);
        mDriveRightB.setNeutralMode(NeutralMode.Brake);
    }
        
    public void EnableVoltComp() {
        mDriveLeftMaster.enableVoltageCompensation(true);
        mDriveLeftB.enableVoltageCompensation(true);
        mDriveRightMaster.enableVoltageCompensation(true);
        mDriveRightB.enableVoltageCompensation(true);
    }
    public void DisableVoltComp() {
        mDriveLeftMaster.enableVoltageCompensation(false);
        mDriveLeftB.enableVoltageCompensation(false);
        mDriveRightMaster.enableVoltageCompensation(false);
        mDriveRightB.enableVoltageCompensation(false);
    }
    public void StopDrivetrain() {
        mDriveLeftMaster.set(ControlMode.PercentOutput, 0.0);
        mDriveRightMaster.set(ControlMode.PercentOutput, 0.0);
    }

    //turning algirithm
    public void Curvature(double ThrottleAxis, double TurnAxis) {
        TurnRateCurved = (Constants.MotorConstants.kTurnrateCurve*Math.pow(TurnAxis,3)+(1-Constants.MotorConstants.kTurnrateCurve)*TurnAxis*Constants.MotorConstants.kTurnrateLimit);
        mDrive.curvatureDrive(ThrottleAxis, TurnRateCurved, true);  
    }
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
    public void resetEncoders() {
        mDriveLeftMaster.setSelectedSensorPosition(0, 0, Constants.MotorConstants.kTimeoutms);
        mDriveRightMaster.setSelectedSensorPosition(0, 0, Constants.MotorConstants.kTimeoutms);
    }

    

    //   public void ReportData() {
    //     SmartDashboard.putNumber("IMU_Yaw", ahrs.getYaw());
    //     SmartDashboard.putNumber("turnoutput", getTurnOutput());
    //     SmartDashboard.putNumber("leftIPS", leftveloIPS_);
    //     SmartDashboard.putNumber("rightIPS", rightveloIPS_);
    //     SmartDashboard.putNumber("leftraw", mDrive_Left_Master.getSelectedSensorVelocity());
    //     SmartDashboard.putNumber("rightraw", mDrive_Right_Master.getSelectedSensorVelocity());
    //   }

}
