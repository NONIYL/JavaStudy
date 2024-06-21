package quiz;

import java.util.Scanner;

public class D05_isJaveVeriable {

	/*
	  사용자로부터 문자열을 입력받으면 해당 문자열이 
	  자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 */
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요 > ");
		String input = sc.nextLine();
		int len = input.length();

		for (int i = 0; i < len; ++i) {
			char ch = input.charAt(i);
		

			System.out.println("자바의 변수로 사용할 수 있는 문자열인가요? " + Character.isJavaIdentifierPart(ch));

		}

	}
}
