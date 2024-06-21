package quiz;
import java.util.Scanner;

public class B09_Numeric {
	
	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별해주는 프로그램을 만들어보세요
    */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int len = input.length();
		boolean isNumeric = true;

		for (int i = 0; i < len; i++) {
			char ch = input.charAt(i);
			if (ch < '0' || ch > '9') {
				isNumeric = false;
				break;
			}
		}

		if (isNumeric) {
			System.out.println("모두 숫자로 이루어짐");
		} else {
			System.out.println("모두 숫자로 이루어지지 않았음");
		}
	}
}