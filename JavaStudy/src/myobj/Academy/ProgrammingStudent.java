package myobj.Academy;

public class ProgrammingStudent {
	static String[] LastNameCandidates = {"김","이","박","최"};
	static String[] firstNameCandidates = {"영","철","수","지","민","식","시","은"};
	
	static int stuCount = 1;
	
	String stuName;
	String stuNum;
	int kor;
	int eng;
	int math;
	int c;
	int op; //operator
	int ds; // date structure
	
	public ProgrammingStudent() {
		this.kor = getRandomScore();
		this.eng = getRandomScore();
		this.math = getRandomScore();
		this.c = getRandomScore();
		this.op = getRandomScore();
		this.ds = getRandomScore();	
		//String.format("format", values...) : 서식을 활용해 원하는 문자열을 생성하는 메서드
		this.stuNum = String.format("EZEN%06d", stuCount++);
		this.stuName = getRandomName();
	}
	
	public static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
	
	public static String selectRandomOne(String[] arr) {
		return arr [(int)(Math.random() * arr.length)];
	}
	
	public static String getRandomName2() {
		return selectRandomOne(LastNameCandidates)
				+  selectRandomOne(firstNameCandidates)
				+ selectRandomOne(firstNameCandidates);
	}
	public static String getRandomName() {
		return LastNameCandidates[(int)(Math.random() * LastNameCandidates.length)]
				+ firstNameCandidates[(int)(Math.random() * firstNameCandidates.length)]
				+ firstNameCandidates[(int)(Math.random() * firstNameCandidates.length)];
	}
	@Override
	public String toString() {
		return String.format("%s\t/%s", stuNum, stuName);
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; ++i) {
			System.out.println(new ProgrammingStudent());
		}
	}
}

