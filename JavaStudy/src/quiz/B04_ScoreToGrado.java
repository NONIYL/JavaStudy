package quiz;
import java.util.Scanner;

public class B04_ScoreToGrado {

	/*
	  	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	  	평균 점수와 등급을 출력해주는 프로그램을 만들어보세요.
	  	( ※ 각 과목의 유효 점수는 0 ~ 100점이고,
	  		유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 F로 나와야 한다)
	  		
	  	1. 평균점수 90점 이상 A
	  	2. 평균점수 80점 이상 B 
	  	3. 평균점수 70점 이상 C
	  	4. 평균점수 60점 이상 D
	  	그 외 F
	  	====================================================================================
	  	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int L = sc.nextInt();
		
		System.out.print("영어: ");
		int E = sc.nextInt();
		
		System.out.print("수학: ");
		int M = sc.nextInt();
		
		double score = ((L + E + M) /3.0);
			
		*** if (score >= 90) {
			 System.out.printf("평균점수 %.1f점 이상 A등급입니다.", score);
			 System.out.println(score > 0 && score <100); -> x 각 점수 cheat 찾아야함
		
	
		} else if (score >= 80) {
			System.out.printf("평균점수 %.1f점 이상 B급입니다.", score);
		} else if (score >= 70) {
			System.out.printf("평균점수 %.1f점 이상 C등급입니다.", score);
		} else if (score >= 60) {
			System.out.printf("평균점수 %.1f점 이상 D등급입니다.", score);
		} else {
			System.out.printf("평균점수 %.1f점 이상 F등급입니다.", score);
		} 

	
	}
	 */

	public static void main(String[] args) {
		
		//ctrl + shift + 0 : import 단축키
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;	
		
		System.out.print("국/영/수: 점수 입력 > ");
		 kor= sc.nextInt();
		 eng= sc.nextInt();
	     math = sc.nextInt();
	     
	     // 이상한 값이 있을 떄 true로 변경할 예정인 변수
	     boolean cheat = false;
	
	     if (kor < 0 || kor > 100) {
	    	 System.out.println("국어 점수가 이상합니다!");
	    	 cheat = true; //-> cheat = cheat || true; 표현할 수 있으나 cheat = true;랑 결국 같은말
	     }
	     if (eng < 0 || eng > 100) {
	    	 System.out.println("영어 점수가 이상합니다!");
	    	 cheat = true;
	     }
	     if (math < 0 || math > 100) {
	    	 System.out.println("수학 점수가 이상합니다!");
	    	 cheat = true;
	     }
	     
	     double avg;
	     char grade;
	     // 이상한 점수가 없으면 평균 점수를 계산
	     // 이상한 점수가 있으면 그냥 점수를 넣음
	     if (cheat) {
	    	 avg = 0;
	    	 grade = 'F';
	    	 
	     } else {
	    	 avg = (kor + eng + math) / 3.0; // 평균 점수를 구하기 위해 실수로 나눈다
	    	 
	    	 if (avg >= 90) {
	    		 grade = 'A';
	    	 } else if (avg >= 80) {
	    	     grade = 'B';
	    	 } else if (avg >= 70) {
	    		 grade = 'C';
	    	 } else if (avg >= 60) {
	    		 grade = 'D';
	    	 } else {
	    		 grade = 'F';
	     }
	   }
	     
	if (cheat) {
		System.out.println("잘못된 점수로 인해 " + avg + "점 처리 되었습니다.");
		System.out.println("등급은 " + grade + "입니다.");
	} else {
		System.out.printf("평균 점수 '%.2f'점으로 '%c'등급입니다.\n", avg, grade);
	}
	
   }

}