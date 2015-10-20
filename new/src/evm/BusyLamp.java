package evm;


public class BusyLamp extends Lamp {

	
public void switchState(){
		
		if(StateName=="off"){
			
			StateName="on";
			
			System.out.println("Busy Lamp glows");
		}
		
		else{
			
			StateName="off";
			
			System.out.println("Busy Lamp off");
		}
		
	}
}
