package quiz;

import java.util.Scanner;

public class E01_NumberOnly {
	/*
	 	사용자로부터 스캐너의 nextInt()로 숫자를 입력받되, 숫자가 아닌것을 입력하더라도 
	 	프로그램이 강제종료되지 않고 다시 입력받을 수 있게 만들어보세요
	 */
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("> ");

		try {
			int user = sc.nextInt();
			System.out.println(user);

		} catch (Exception e) {
			boolean error = false;

			while (true) {
				int user = sc.nextInt();
				System.out.println(user);
				break;
			}
			//if() {
		}

	}

}
