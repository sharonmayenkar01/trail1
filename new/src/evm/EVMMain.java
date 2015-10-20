package evm;


public class EVMMain {

	public static void main(String[] args) {
		
		EVM evm= new EVM();

		evm.setUpElection();
		
		evm.startPoll();
		
		evm.vote();
		
		//evm.closePoll();
		
		//evm.result();
		
		//evm.clear();
		
		
	}
}
