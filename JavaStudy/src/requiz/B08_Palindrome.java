package requiz;

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
		System.out.print("단어를 입력하세요: ");
		
		String txt = sc.nextLine();
		int len = txt.length();
		//입력한 단어를 다 볼 필요가 없다.
		//문자의 중간을 잘라 양 옆을 확인해보자
		int half = len / 2;

		//boolean을 쓰는 이유: 좌우대칭이 맞으면 멈추고 아니라면 계속 돌아야해서
		//if()안의 문법이 true여야 실행하기 때문.
		boolean isPalindrome = true;
		
		//입력받은 문자에 반절을 잘라서 반복을 돌린다.
		for (int i = 0; i < half; ++i) {
			//반절 len의 첫번째 자리
			char ch1 = txt.charAt(i);
			//반절 len의 끝자리
			char ch2 = txt.charAt(len - i - 1);
			//같지 않다면
			if (ch1 != ch2) {
				//ispal은 false이다.
				isPalindrome = false;
				//멈춘다 
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
