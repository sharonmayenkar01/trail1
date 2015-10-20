package evm;


public class EVM {

	BallotUnit ballotUnit = new BallotUnit();
	ControlUnit controlUnit= new ControlUnit();;
	
	
	public void setUpElection() {
		// TODO Auto-generated method stub
		ballotUnit.readyLamp.switchState();
		ballotUnit.slideSwitch.setNoUnits();
		controlUnit.display.onLamp.switchState();
		
		
	}


	public void startPoll() {
		// TODO Auto-generated method stub
		ballotUnit.candInfo.maskTab();
		
		//ballotUnit.BallotOn();
	
	}


	public void vote() {
		// TODO Auto-generated method stub
		ballotUnit.candLamp.switchState();
		ballotUnit.candButton.switchButton();
	    controlUnit.display.busyLamp.switchState();
        controlUnit.ballot.total.getTotalVotes();
	}


	public void closePoll() {
		// TODO Auto-generated method stub
		
	}


	public void result() {
		// TODO Auto-generated method stub
		
	}


	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}
