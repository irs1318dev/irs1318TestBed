package org.usfirst.frc1318.shared.minimike;

import org.usfirst.frc1318.reference.PS2Controller;

import edu.wpi.first.wpilibj.DigitalInput;

public class MMSensors {

	private MMSensors(){
	} //ensure singelton
	
	private static MMSensors self;
	private PS2Controller gamePad;
	private DigitalInput leftLimitSwitch;
	private DigitalInput rightLimitSwitch;
	
	public MMSensors getInstance(){
		if(self == null)
		{
			self = new MMSensors();
		}
		return self;
	}
	
	//set gamepad
	public void setGamePad(PS2Controller gamePad)
	{
		this.gamePad = gamePad;
	}
	
	//get controller if initialized, else throw exception
	public PS2Controller getGamePad() throws Exception
	{
		if(null != gamePad)
		{
			return gamePad;
		}else{
			throw new Exception("Gamepad not initialized");
		}
	}
	
	//set limit switches
	public void setLimitSwitches(DigitalInput right, DigitalInput left)
	{
		this.leftLimitSwitch = left;
		this.rightLimitSwitch = right;
	}
	
	public int getLimitSwitchState()
	{
		//TODO this doesn't do anything yet.  add functionality if used
		return 0;
	}
	
	
	
	
}
