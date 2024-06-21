package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class D09_isPhoneNumber {

	/*
	 * # 전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 * 
	 */

	public static void main(String[] args) {

		
		// - 번호를 나눈다 짝대기를 기준으로 문자열을 나눈다.
		//  번호를 0 - 1 - 2 : 0부분 1부분 2부분이 번호인지 아닌지 확인
		//0번째에 있는 인덱스의 번호가 010이 아니라면 틀림!
		//끗
		
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력하세요> ");
		String input = sc.nextLine();
		int len = input.length();

		String[] phoneNum = input.split("-");

		System.out.println(Arrays.toString(phoneNum));
		for (String PN : phoneNum) {
			System.out.println(PN);
			
		
		for(int i = 0; i < len; ++i) {
			char ch =input.charAt(i);
			
			
		}
		
		
			
		}
	}

public static void PhoneNum() {
	

	
	}
	
}


