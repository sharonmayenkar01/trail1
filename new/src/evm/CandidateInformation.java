package evm;


public class CandidateInformation {
	
	int numOfCandidates=4;
	String nameOfCandidate;
	int candId;
	
    public String getNameOfCandidate() {
		return nameOfCandidate;
	}

	public void setNameOfCandidate(String nameOfCandidate) {
		this.nameOfCandidate = nameOfCandidate;
	}

	public int getCandId() {
		return candId;
	}

	public void setCandId(int candId) {
		this.candId = candId;
	}


	public void maskTab(){
		
		System.out.println("Total candidates");
		System.out.println("Masking remaining " +(16-numOfCandidates)+" switches");
				
	}

}
