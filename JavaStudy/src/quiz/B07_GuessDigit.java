package quiz;

import java.util.Scanner;

public class B07_GuessDigit {

	/*
	 * (1) 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력: ");
		
		int input = sc.nextInt();
		int digits = 0;

		//   1 초기화식         2 조건식    4 증감식
		for (int num = input; num != 0; num /= 10) {
			
			// 3 사용자코드
			++digits;
		}
		

		System.out.printf("%d은 %d자리 숫자입니다.\n", input, digits);
	}
}