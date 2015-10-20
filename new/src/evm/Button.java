package evm;


public abstract class Button {
	
protected String StateName;
	
	abstract void switchButton();

	public Button(){
		
		this.StateName= "off";
	}

}
