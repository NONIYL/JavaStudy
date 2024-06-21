package quiz;
import java.util.Scanner;

public class B03_ConditionQuiz2 {
	/*
	 	# 알맞은 조건식을 만들어보세요
	 	
	 	1. char형 변수 a가 'q' 또는 'Q'일 때 true
	 	2. char형 변수 b가 공백이나 탭이 아닐 때 true
	 	3. char형 변수 c가 '0' ~ '9'일 때 true
	 	4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	 	5. char형 변수 e가 한글일 때 true(한글의 범위는 유니코드 검색)
	 	6. 사용자가 입력한 문자열이 quit일 때 true
	*/
	
	public static void main(String[] args) {
		
		System.out.println((int)'A');
		char a = 'q';
		System.out.println( a=='q' || a=='Q' );
		
		char b = 'd';
		System.out.println( !(b==' ' || b=='\t') );
		System.out.println( b!=' ' && b!='\t' );
		
		char c = '5';
		System.out.println(c >= '0' && c <= '9');
		
		char d = 'Z';
		System.out.println( d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z');
		
		char e = '가';
		System.out.println(e >= 44032 && e <= 55203);
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		// 문자열 비교는 ==으로 하면 안된다
		System.out.println(input == "quit");
		
		// 문자열 비교는 equals()
		System.out.println(input.equals("quit")
				|| input.equals("QUIT") || input.equals("Quit")
				|| input.equals("quiT"));
		
		// 대소문자 상관없이 같은 문자열인지 비교
		System.out.println(input.equalsIgnoreCase("quit"));
		
		sc.close();
	}
}
