package EVM_latest;

public abstract class lamp {
protected String stateName;
abstract void switchState();
public lamp(String stateName){
	this.stateName="off";
}
}
