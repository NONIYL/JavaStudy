package quiz;
import java.util.Scanner;

public class B08_Palindrome {
	
	/*
		사용자가 단어를 입력하면
		해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만들어 보세요
		
		>> LEVEL
		-> 좌우 대칭입니다.
		
    */

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		String txt = sc.nextLine();
		int len = txt.length();
		int half = len / 2;

		boolean isPalindrome = true;

		for (int i = 0; i < half; i++) {
			char ch1 = txt.charAt(i);
			char ch2 = txt.charAt(len - i - 1);
			if (ch1 != ch2) {
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("\"" + txt + "\"는 좌우대칭입니다.");
		} else {
			System.out.println("\"" + txt + "\"는 좌우대칭이 아닙니다.");
		}
	

	}
}
