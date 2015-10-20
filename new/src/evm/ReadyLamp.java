package evm;



public class ReadyLamp extends Lamp{


	public void switchState(){
		
		if(StateName=="off"){
			
			StateName="on";
			
			System.out.println("Ready Lamp glows");
		}
		
		else{
			
			StateName="off";
			
			System.out.println("Ready Lamp off");
		}
		
	}



}
