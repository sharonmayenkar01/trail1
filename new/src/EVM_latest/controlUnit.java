package EVM_latest;

public class controlUnit {
	displaySection displaySection;
	resultSection resultSection;
	ballotSection  ballotSection;
	candidateSetSection candidateSetSection;
	onLamp onLamp;
	
	controlUnit(){
		displaySection=new displaySection();
		resultSection=new resultSection();
		ballotSection=new ballotSection();
		candidateSetSection=new candidateSetSection();
		onLamp=new onLamp();
	}

public void controllUnitOn()
{
	onLamp.unitPoweredOn();
	//ballotSection.ballotBtn();
	//ballotSection.totalBtn();
}
}
