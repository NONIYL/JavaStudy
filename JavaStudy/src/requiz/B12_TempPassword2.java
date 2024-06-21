package requiz;

import java.util.Random;

public class B12_TempPassword2 {
	/*
 	대문자, 소문자, 특수문자. 숫자로 구성된 
 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
 	
 	※ 비밀번호로 사용가능한 특수문자의 아스키코드 범위 33 ~ 47
 	
 	대문자 : 65 ~ 90
 	소문자 : 97 ~ 122
 	특수문자 : 33 ~ 47
 	숫자 : 48 ~ 57
 	
 	*/

	public static void main(String[] args) {
	
		Random ran = new Random();
		String set = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuvwxyz" + "0123456789!\"#$%&'()*+,-./";
		
		for (int i = 0; i < 20; ++i) {
			String pw = "";
			
			for(int j = 0; j < 6; ++j) {
				
				//빈 공간에 set의 갯수를 일일히 세기 힘드니 length로 읽어주고 
				//랜덤으로 돌려버림
				int temp = (int)(Math.random() * set.length());
				//패스워드 변수에 랜덤으로 담은 set을 넣은 temp을 넣어줌
				pw += set.charAt(temp);
			}
			System.out.println(pw);
		}


			
	}
}

// ######씽긔;;; 20번째마다 랜덤 번호 만들어짐ㅋㅋ;######
//Random r = new Random();
//
////랜덤 비밀번호 20개
//for(int i = 0; i < 20; ++i) {
//	String temp = "";
//	for(int j = 0; j < 6; ++j) {
//	//6자리
//		temp += (char)((Math.random() * 26 ) + 65);
//		temp += (char)((Math.random() * 25 ) + 97);
//		temp += (char)((Math.random() * 14 ) + 33);
//		temp += (char)((Math.random() * 9 ) + 48);
//			
//	}
//	for(int a = 0; a < 20; ++a) {
//		System.out.println("%d." + a);
//	}
//	System.out.println(temp);
//	
//}
//
//}
//
//}
//

