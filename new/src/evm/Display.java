package evm;


public class Display {

	Lamp busyLamp;
	Lamp onLamp;
	Display1 d1;
	Display2 d2;
	
	
	public Display() {
		super();
		busyLamp =  new BusyLamp();
		onLamp =  new ONLamp();
		d1 =  new Display1();
		d2 =  new Display2();
	}
	
	
	
	
}
