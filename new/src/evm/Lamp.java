package evm;


public abstract class Lamp {
	
protected String StateName;
	
	abstract void switchState();

	public Lamp(){
		
		this.StateName= "off";
	}
}
