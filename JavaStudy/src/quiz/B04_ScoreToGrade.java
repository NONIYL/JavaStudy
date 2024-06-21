package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {
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
//
//		Scanner sc = new Scanner(System.in);
//
//		boolean error = false;
//		int kor, eng, math;
//		double avg;
//		char grade;
//
//		System.out.print("국어 점수 입력: ");
//		kor = sc.nextInt();
//
//		System.out.print("영어 점수 입력: ");
//		eng = sc.nextInt();
//
//		System.out.print("수학 점수 입력: ");
//		math = sc.nextInt();
//		
//		if (!(kor >= 0 && kor <= 100 &&
//			  eng >= 0 && eng <= 100 &&
//			  math >= 0 && math <= 100)) {
//			error = true;
//		}
//
//		if (error) {
//			System.out.println("[오류] 유효하지 않은 점수가 감지되었습니다.");
//			avg = 0;
//			grade = 'F';
//		} else {
//			aver = (kor + eng + math) / 3.0;
//
//			if (aver >= 90) {
//				grade = 'A';
//			} else if (aver >= 80) {
//				grade = 'B';
//			} else if (aver >= 70) {
//				grade = 'C';
//			} else if (aver >= 60) {
//				grade = 'D';
//			} else {
//				grade = 'F';
//			}
//		}
//		System.out.printf("평균 점수는 %.2f점이며 등급은 %c등급입니다.", avg, grade);

		Scanner sc = new Scanner(System.in);
		int kor, eng, math;

		System.out.print("국/영/수 점수 입력 >");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		boolean cheat = false;
		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수가 이상합니다!");
			cheat = true;
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

		if (cheat) {
			avg = 0;
			grade = 'F';
		} else {
			avg = (kor + eng + math) / 3.0;

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
			System.out.println("잘못된 점수로 인해 " + avg + "점 처리 되었습니다");
			System.out.println("등급은 " + grade + "입니다");
		} else {
			System.out.printf("평균: %.2f점으로 %c등급 입니다.", avg, grade);
		}
	}
}
