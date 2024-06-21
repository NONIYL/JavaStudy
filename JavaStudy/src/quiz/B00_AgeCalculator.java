package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {
	
	/*
	 	이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보쇼
	 	
	 	ex> 김동우 1997
	 	    김동우(28세)
	
	*/
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 및 출생년도: ");
		
		String name = sc.next();

		int bornYear = sc.nextInt();
		int thisYear = 2024;
		
		int age = thisYear - bornYear + 1;
		
		System.out.printf("%s(%d세)",name, age);
		
		sc.close();
		
	}
}
