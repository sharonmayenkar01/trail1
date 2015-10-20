package evm;


public class ONLamp extends Lamp {
	
public void switchState(){
		
		if(StateName=="off"){
			
			StateName="on";
			
			System.out.println("Unit powered on");
		}
		
		else{
			
			StateName="off";
			
			System.out.println("Unit off");
		}
		
	}

}
