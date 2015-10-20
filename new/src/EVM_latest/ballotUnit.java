package EVM_latest;

public class ballotUnit {
	candidateButton candidateButton;
	readyLamp readylampOn;
	slideSwitch slideSwitch;
	candidateLamp candidateLamp;
	candidateInfo candidateInfo;
	clamp clamp;
	controlUnit controlUnit;
	
	ballotUnit(){
		readylampOn=new readyLamp("off");
	 candidateButton=new candidateButton();
	 slideSwitch=new slideSwitch();
	candidateLamp=new candidateLamp();
	candidateInfo=new candidateInfo();
	clamp=new clamp();
	controlUnit controlUnit=new controlUnit();
	}
public void releaseBallot(){
		busyLamp.glowBusyLamp();
		//readylampOn.setLampState("Glowing");
		//readylampOn.switchOn();
		//System.out.println("Lamp : "+readylampOn.getLampState());
		slideSwitch.setNoOfUnits();
		candidateLamp.candidateLampGlow();

		candidateButton.castYourVote();
		candidateInfo.maskTab();
		//readylampBusy.setLampState("Busy");
		//System.out.println("Lamp : "+readylampBusy.getLampState());
	}
}
