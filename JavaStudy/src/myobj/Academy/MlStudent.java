package myobj.Academy;

//머신러닝 반 학생들은
//국어, 영어, 수학, 통계학, 파이썬, No-SQL 점수가 있다
public class MlStudent extends AcademyStudent {
	static String[] subjectNames = { "국어", "영어", "수학", "통계학", "파이썬", "NO_SQL" };
	int[] scores = new int[6];
	
	// MlStudent() : ()가 비어있으면 입력받을 필요가 없다
	public MlStudent() {
		for(int i = 0; i < scores.length; ++i) {
			scores[i] = generateRandomScore();
		}
	}

	@Override
	public int getTotal() {
		int sum = 0;

		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum;
	}

	@Override
	public double getAvg() {
		return super.getTotal() / (double) scores.length;
	}

	@Override
	public String getScores() {
		String str = "";

		for (int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %d\n", subjectNames[i], scores[i]);
		}
		return str;
	}
	
	/*
	  public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		MlStudent ms = new MlStudent();
		
		ms.getAvg(); 
		
	*/
		
	
}


