public class CandidateDemostrate {
	public static void main(String[] args) {
		Candidate c1= new Candidate();
		c1.setCandidateDetails(1,"name1",60,20);
		c1.getCandidateDetails();
	}
}
class Candidate{
	int candidateId;
	String candidateName;
	int candidateWeight;
	int candidateHeight;

	void setCandidateDetails(int candidateId, String candidateName, int candidateWeight, int candidateHeight){
		this.candidateId= candidateId;
		this.candidateName= candidateName;
		this.candidateWeight= candidateWeight;
		this.candidateHeight= candidateHeight;
	}
	void getCandidateDetails(){
		System.out.println(candidateId);
		System.out.println(candidateName);
		System.out.println(candidateWeight);
		System.out.println(candidateHeight);
	}
}