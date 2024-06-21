package quiz;

import java.util.Random;

public class B12_Tempassword {
	
	
	/*
	 	알파벳 대문자로만 구성된 랜덤 4자리 /비밀번호를 20개 생성하여 출력해보세요
	 	
	 */

	public static void main(String[] args) { 
		
		Random ran = new Random();
			
		//char도 쓸 수 있지만 int를 쓰는게 더 바람직함
		for (char i = 0; i < 20; ++i ) {
			String password = "";
			for (char j = 0; j < 4; ++j) {	
				password += (char)((Math.random() * 26) + 65); 
			
		}
			System.out.println(password);
		}
		
	}
}
	
		
	/*

	 public static void main(String[] args) { 
			
		for (int i = 0; i < 20; ++i ) {
		String password = "";
			for ( int keyLen = 0; keyLen < 4; ++keyLen) {	
				password += (int)(Math.random() * 26 + 65);
				
			}	
			System.out.print(i + "번째 비밀번호: " + password);
				
			
	 
	 */
	
	
	
	
	
	
	

