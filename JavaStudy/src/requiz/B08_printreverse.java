package requiz;

import java.util.Scanner;

public class B08_printreverse {

	/*
	사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장입력> ");
		String txt = sc.nextLine();
		int len = txt.length();
		
		//1번째 거꾸로 뽑아내기 방법
		//1번은 i가 받은 문장길이에 -1씩 빼서 0이될때 txt를 출력 
		for( int i = len - 1; i >= 0; --i) {
			System.out.print(txt.charAt(i));
			
		}
		System.out.println();
		//2번째 거꾸로 뽑아내기 방법
		//2번은 i가 받은 문장이 첫번쨰부터 len까지 돌때 '-i'(-1,-2,-3..)
		//(len - 1 - i)의 i는 글자의 끝부분을 가리킨다.
		for(int i = 0; i < len; i++) {
			System.out.print(txt.charAt(len - 1 - i));
		}
			
	}
}
