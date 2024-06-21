package requiz;
import java.util.Scanner;
public class B04_scoretograde2 {

	/*
	 * 국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에 평균 점수와 등급을 출력해주는 프로그램을 만들어보세요 (각 과목의 유효
	 * 점수는 0 ~ 100점이고, 유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 F로 나와야 한다)
	 * 
	 * 1. 평균점수 90점 이상 A
	 * 2. 평균점수 80점 이상 B
	 * 3. 평균점수 70점 이상 C
	 * 4. 평균점수 60점 이상 D
	 * 5. 그 외 F
	 */
	
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("점수를 입력하세요: ");
		 
		 int language = sc.nextInt();
		 int english = sc.nextInt();
		 int math = sc.nextInt();
		 
		 double grand =  (language + english + math) / 3.0 ;
		 
		if(grand > 90) {
			System.out.println("A등급 입니다.");
		} else if (grand > 80) {
			System.out.println("B등급 입니다.");
		} else if (grand > 70) {
			System.out.println("C등급 입니다.");		
		} else if (grand > 60) {
			System.out.println("D등급 입니다.");
		} else
			System.out.println("F등급 입니다.");
		
		
		System.out.printf("평균점수는 %.2f 입니다. " , grand);
		
		
		
		
		
		
	}
	
	
	
	
}
