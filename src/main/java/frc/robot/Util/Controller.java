/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;




/**
 * @author Fernando Matias
 */
public class Controller extends Joystick{

    private final Trigger[] mButtons = {
        new JoystickButton(this, 0),
        new JoystickButton(this, 1),
        new JoystickButton(this, 2),
        new JoystickButton(this, 3),
        new JoystickButton(this, 4),
        new JoystickButton(this, 5),
        new JoystickButton(this, 6),
        new JoystickButton(this, 7),
        new JoystickButton(this, 8),
        new JoystickButton(this, 9),
        new JoystickButton(this, 10),
        new JoystickButton(this, 11),
        new JoystickButton(this, 12),
    };

    public Controller(int port){
        super(port);
    }

    //Axes
    public double getLeftXAxis(){
        return getRawAxis(0);
    }

    public double getLeftYAxis(){
        return getRawAxis(1);
    }

    public double getRightXAxis(){
        return getRawAxis(4);
    }

    public double getRightYAxis(){
        return getRawAxis(5);
    }
    
    //buttons
    public Trigger getButtonA(){
        return mButtons[1];
    }

    public Trigger getButtonB(){
        return mButtons[2];
    }

    public Trigger getButtonX(){
        return mButtons[3];
    }
    public Trigger getButtonY(){
        return mButtons[4];
    }
    public Trigger getLeftBumper(){
        return mButtons[5];
    }

    public Trigger getRightBumper(){
        return mButtons[6];
    }
    
    //triggers
    public double getLeftTrigger(){
        return getRawAxis(2);
    }

    public double getRightTrigger(){
        return getRawAxis(3);
    }

    //extra buttons
    public Trigger getButtonBack(){
        return mButtons[7];
    }

    public Trigger getButtonStart(){
        return mButtons[8];
    }

    public Trigger getButtonLeftStick(){
        return mButtons[9];
    }

    public Trigger getButtonRightStick(){
        return mButtons[10];
    }
}