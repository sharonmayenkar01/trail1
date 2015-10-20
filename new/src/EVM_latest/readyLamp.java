package EVM_latest;

public class readyLamp extends lamp{


public readyLamp(String stateName) {
		super(stateName);
		// TODO Auto-generated constructor stub
	}

@Override
void switchState() {
	// TODO Auto-generated method stub
	if(stateName=="off"){
		stateName="on";
		System.out.println("Ready Lamp On");
	}
	else
	{
		stateName="off";
		System.out.println("Ready Lamp Off");
	}
}

}
