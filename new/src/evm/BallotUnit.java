package evm;

import java.util.ArrayList;


public class BallotUnit {
	
	SlideSwitch slideSwitch;
	Button candButton;
    Lamp readyLamp;
    Lamp candLamp;
    CandidateInformation candInfo;
    
    ArrayList<CandidateInformation> contestingCandidate=new ArrayList<CandidateInformation>();
    
   BallotUnit(){
	   slideSwitch = new SlideSwitch();
	   candButton = new CandidateButton();
	   readyLamp = new ReadyLamp();
	   candLamp = new CandidateLamp();;
	   candInfo= new CandidateInformation();
    }
   public void add(){
	   
   }

}
