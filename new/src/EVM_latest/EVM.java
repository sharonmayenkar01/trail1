package EVM_latest;

public class EVM {
	ballotUnit ballotUnit=new ballotUnit();
	controlUnit controllUnit=new controlUnit();
	
	public void startEVM(){
		ballotUnit.readylampOn.switchState();
		//controllUnit.controllUnitOn();
	}
	public void stopEVM(){
	
	}
}
