package requiz;

import java.util.Scanner;

public class B09_numeric {

	
	/*
		사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지
		판별해주는 프로그램을 만들어보세요
    */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		
		String input = sc.nextLine();
		int len = input.length();
		
		boolean num = true;
				
		for (int i = 0; i < len; ++i) {
			char ch = input.charAt(i);
			//숫자 0보다 작거나, 9보다 큰경우
			if(ch < '0' || ch > '9') {
				//그건 숫자가 아니다(아스키표 참조)
				num = false;
				//멈춤
				break;
			}
			
		}
		if(num) {
			System.out.println("숫자로만 구성됨");
		} else {
			System.out.println("숫자로만 구성되지 않음");
		}
	}
	
}
