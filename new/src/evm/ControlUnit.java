package evm;


public class ControlUnit {
	
	Display display;
	CandidateSet candSet;
	ResultSet resultSet;
	Ballot ballot;
	
	
	ControlUnit(){
		
		display = new Display();
		candSet = new CandidateSet();
		resultSet = new ResultSet();
		ballot = new Ballot();
		
	}

}
