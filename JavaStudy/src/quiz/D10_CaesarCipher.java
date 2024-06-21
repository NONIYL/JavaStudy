package quiz;

public class D10_CaesarCipher {
	
	/*
	 	# 시저(카이사르) 암호
	 	
	 	- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을 생성하는 
	 	  암호 알고리즘
	 	  
	 	  [표]
	 	  
	 	  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+
	 	  abcdefghijklmnopopqrstuvwxyz {}[]|\;:'"/?<>,.
	 	  
	 	  *암호화 
	 	  
	 	  (평문)			   key:3			(암호문)
	 	  HELLO!	-------------------->   KHOOR!
	 	  
	 	  *복호화
	 	 		   		   key:3
	 	  HELLO!	<--------------------   KHOOR!
	 	  
	 	  
	//1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	
	//2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	
	//3. 사용할 수 있는 문자의 종류: 영어 대/소문자, 숫자, 특수문자
	 	     
	 */
	
	public static void main(String[] args) {

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
				+ "abcdefghijklmnopopqrstuvwxyz {}[]|\\;:'\"/?<>,.";

		str.replace(" ", "");
		StringBuilder cs = new StringBuilder(str);
		

		int len = cs.length();

		for (int i = 0; i < len; ++i) {
			char ch = cs.charAt(i);

			if (ch < 'A' && ch > '.') {

			}
			
		}

			// 1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
			int ch = str.indexOf("C");
			System.out.println(ch);
			
			cs.replace(0, 3, "3");
			System.out.println("암호문: " + cs);
			
			
			// 2. 암호문과 키값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
			
			strCode srtcode1 = new strCode();
			
//			strCode1.insert(0, 'A');
//			strCode1.insert(1, 'B');
////			strCode1.replace(0, 3, "C");
//			System.out.println("복호화: " + strCode1);
//			

			
	}

}
class strCode {

	String codeee(String strCode) {
	StringBuilder strCode1 = new StringBuilder();
	
	int cs = strCode1.length();
	for (int i = 0; i < cs; i++) {
		char ch = strCode1.charAt(i);
		
		if (ch > 'A' && ch < '.') {
			System.out.println(ch);
			
		
			
			
		}
	}
	return strCode1.toString();

}
	
	
}