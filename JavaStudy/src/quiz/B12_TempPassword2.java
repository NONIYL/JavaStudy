package quiz;

public class B12_TempPassword2 {
	

	/*
	 	대문자, 소문자, 특수문자. 숫자로 구성된 
	 	6자리 랜덤 비밀번호를 20개 생성하여 출력하는 프로그램을 만들어보세요
	 	
	 	※ 비밀번호로 사용가능한 특수문자의 아스키코드 범위 33 ~ 47
	 	
	 	대문자 : 65 ~ 90
	 	소문자 : 97 ~ 122
	 	특수문자 : 33 ~ 47
	 	숫자 : 48 ~ 57
	 	
	 	

	public static void main(String[] args) { 
		
		Random ran = new Random();
		
		
		String password = "";
		
		
		  for ( char i = '0'; i <= '9'; ++i) {
		  }
		  for ( char i = 'a'; i <= 'z'; ++i) {  
		  }
		  for ( char i = 'A'; i <= 'Z'; ++i) {
		  }
		  for ( char i = '!'; i <= '/'; ++i) {
		  }
		  
		  
		  int len = password.length();
		  char num = password.charAt(len);
		  
			for (char i = 0; i < 6; ++i) {
				for (char j = 0; j < 1; ++j) {
					System.out.print("비밀번호 입력: " + password);
				}
				 System.out.println();
				
			}
	
===============================================================================================================			 
	
			public static void main(String[] args) { 
					
				for (int i = 0; i < 20; ++i) {
				String password = "";
				for (int KeyLen = 0; KeyLen < 6; ++KeyLen) {
					int select = (int)(Math.random() * 4);
					
					if (select == 0) { 
						password += (char)(Math.random() * 26 + 'A'); 
					} else if (select == 1) {
						password += (char)(Math.random() * 26 + 'a');
					} else if (select == 2) {
						password += (char)(Math.random() * 15 + 33);
					} else if (select == 3) {
						password += (char)(Math.random() * 10 + '0');
					}
		
					
				}
			
				System.out.println( i + "번째 비밀번호: " + password);

				}
	
	
	*/

	public static void main(String[] args) {
		String charset = "ABCDEFGHJKLMNOPQRSTUVWXYZabcdefghjklmnopqrstuvwxyz" + "0123456789!\"#$%&'()*+,-./";

		for (int i = 0; i < 20; ++i) {
			String password = "";

			for (int KeyLen = 0; KeyLen < 6; ++KeyLen) {
				int randomIndex = (int)(Math.random() * charset.length());
				password += charset.charAt(randomIndex);
			}
			System.out.println(password);
		}

	}
}
