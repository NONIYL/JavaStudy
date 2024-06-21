package t_quiz;
import java.util.Scanner;

public class B08_ChangeCase2 {

	/*
	 	사용자가 영어로 된 문장을 입력하면 대소문자를
	 	반대로 바꿔서 출력해주는 프로그램을 만들어보세요
	 	
	 	입력> I Like To Try Apple
	 	출력> i lIKE tO tRY aPPLE
	*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		int len = txt.length();

		String result = "";

		for (int i = 0; i < len; i++) {

			char ch = txt.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				
				result += (char) (ch - 32);
				
			} else if (ch >= 'A' && ch <= 'Z') {
				
				result += (char) (ch + 32);
				
			} else {
				
				result += ch;
				
			}
		}
		
		System.out.println(result);
	}

}
