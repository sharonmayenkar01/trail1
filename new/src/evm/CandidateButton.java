package evm;


public class CandidateButton extends Button{
	
public void switchButton(){
		
		if(StateName=="off"){
			
			StateName="on";
			
			System.out.println("Candidate button is on");
		}
		
		else{
			
			StateName="off";
			
			System.out.println("Candidate button is off");
		}
		
	}

}
