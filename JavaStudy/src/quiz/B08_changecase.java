package quiz;
import java.util.Scanner;
public class B08_changecase {
	/*
	  	사용자가 영어로 완성된 문장을 입력하면 대소문자를 반대로 바꿔서 출력해주는 프로그램을 만드시오
	  	
	  	입력> I like to try Apple
	  	출력> i LIKE tO tRy aPPLE
	  	
	  	※ 입력에 공백 또는 영어가 아닌 문자가 포함되어 있다면 메세지를 출력
	  	
	  	입력> 한글
	  	출력> 이 프로그램에는 영어와 공백만 입력하실 수 있습니다.
	
		*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요> ");
		
		String input = sc.nextLine();
		int len = input.length();
		
		//문자, 문자열을 담을 곳
		//""; -> String, char
		String temp = "";
		
		for(int i = 0; i < len; ++i) {
			char ch = input.charAt(i);
			
			if ( ch >= 'a' && ch <= 'z') {
				// 소문자에서 32를 빼면 대문자가 된다
				// 그 결과를 temp에 누적시킨다
				//(char)은 (ch-32)를 문자화 시킴  
				temp += (char)(ch - 32); 
			} else if ( ch >= 'A' && ch <= 'Z') {
				// 대문자에서 32를 더하면 대문자 
				// 그 결과를 temp에 누적시킨다
				//(char)은 (ch+32)를 문자화 시킴  
				temp += (char)(ch + 32);
			} else {
				//대문자와 소문자를 모두 누적시킨 temp
				//대문자와 소문자를 제외하고는 그대로 쓰겠다
				temp += ch;
			}
		}
		System.out.println(temp);

	}

}
