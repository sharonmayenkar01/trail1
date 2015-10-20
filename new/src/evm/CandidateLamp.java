package evm;


public class CandidateLamp extends Lamp {
	
public void switchState(){
		
		if(StateName=="off"){
			
			StateName="on";
			
			System.out.println("Candidate Lamp glows. You can cast your vote");
		}
		
		else{
			
			StateName="off";
			
			System.out.println("Candidate Lamp off");
		}
		
	}
}
