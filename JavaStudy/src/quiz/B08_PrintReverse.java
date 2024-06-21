package quiz;
import java.util.Scanner;

public class B08_PrintReverse {
	
	/*
		사용자가 문장을 입력하면 해당 문장을 거꾸로 출력해보세요
    */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 문장을 입력하면
		System.out.print("문장 입력: ");
		String txt = sc.nextLine();
		
		// 해당 문장을 거꾸로 출력해보세요
		int len = txt.length();  // txt가 문장을 받게 하기 위해
		
		//1번째 방법
		for(int i = len - 1; i >= 0; i--) {
			System.out.print(txt.charAt(i));
		}
		
		System.out.println();
		
		//2번째 방법 
		for(int i = 0; i < len; i++) {
			System.out.print(txt.charAt(len - 1 - i));
		}
		

	}
}
