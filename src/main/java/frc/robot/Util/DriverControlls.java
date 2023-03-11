package frc.robot.Util;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * @author Fernando Matias
 */

public class DriverControlls extends Joystick {

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
    };

    public DriverControlls(int port) {
        super(port);
    }

    public Trigger getButtonTrigger() {
        return mButtons[1]; 
    } 
    public Trigger getButton2() { 
        return mButtons[2]; 
    } 
    public Trigger getButton3() { 
        return mButtons[3]; 
    } 
    public Trigger getButton4() { 
        return mButtons[4]; 
    } 
    public Trigger getButton5() { 
        return mButtons[5]; 
    } 
    public Trigger getButton6() { 
        return mButtons[6]; 
    } 
    public Trigger getButton7() { 
        return mButtons[7]; 
    } 
    public Trigger getButton8() { 
        return mButtons[8];
    } 
    public Trigger getButton9() { 
        return mButtons[9];
    } 
    public Trigger getButton10() { 
        return mButtons[10]; 
    } 
    public Trigger getButton11() { 
        return mButtons[11]; 
    } 

    public double getXAxis() { 
        return this.getRawAxis(0); 
    } 
    public double getXAxisInverted() { 
        return -this.getRawAxis(0); 
    } 
    public double getYAxis() { 
        return this.getRawAxis(1); 
    } 
    public double getYAxisInverted() { 
        return -this.getRawAxis(1); 
    } 
    public double getZAxis() { 
        return this.getRawAxis(2); 
    } 
    public double getZAxisInverted() { 
        return 1.0 - this.getRawAxis(2); 
    }
}