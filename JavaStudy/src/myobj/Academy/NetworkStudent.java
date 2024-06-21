package myobj.Academy;

//네트워크 반 학생들은 
//국어,영어,리눅스,네트워크,CCNA 점수가 있다
public class NetworkStudent extends AcademyStudent {
	int kor; 
	int eng;
	int linux;
	int network;
	int ccna; //무언가의 약자인경우 올대문자도 좋다 
	
	public NetworkStudent() {
		super();
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		network = generateRandomScore();
		ccna = generateRandomScore();
		
	}
	@Override
	public int getTotal() {
		return kor + eng + linux + network + ccna;
	}
	@Override
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	@Override
	public String getScores() {
		return String.format("국어: %d\n영어: %d\n리눅스:%d\n",
				"네트워크: %d\nCCNA: %d\n", kor,eng,linux,network,ccna);

	}
}

