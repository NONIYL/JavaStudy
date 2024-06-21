package requiz;

import java.util.Random;

public class B12_Temppassword {
	
	/*
 	알파벳 대문자로만 구성된 랜덤 4자리 /비밀번호를 20개 생성하여 출력해보세요
 	
 */
	
	public static void main(String[] args) {

		Random ran = new Random();

		// 비밀번호 20개를 생성하기 위해 쓴 식이다.
		for (int i = 0; i < 20; ++i) {
			for (int j = 0; j < 4; ++j) {
				// 아스키코드에서 대문자로만 구성된 수는 65~90까지이다.
				// char을 붙여준 이유: int는 정수값이 나오므로 자바에 저장되있는
				// 문자의 값이 나오게 하기 위해서 사용한다.
				// 아스키코드 대문자 A의 시작값: 65
				// 26: A-Z 까지 글자수
				System.out.print((char) ((Math.random() * 26) + 65));
			}
			System.out.println();
		}

	}

}
