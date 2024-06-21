package quiz;

public class C01_FunctionQuiz2 {
	
	
	
	//1. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 함수
	 public static String text(String ran) {
		 
		 char[] arr = new char[ran.length()]; 
		 
		 for (int i = 0; i < arr.length; ++i) {
			 arr[i] = ran.charAt(i);
		 }
		 
		 for (int i = 0; i < 1000; ++i) {
			 int random1= (int)(Math.random()*(arr.length - 1)) + 1;
		
			 int random2 = 0;
			 
		 char temp = arr[random1];
		 arr[random1] = arr[random2];
		 arr[random2] = temp;
			 
		 }
		 return  "klkl\n";
	 }

	//2. 문자열을 전달하면 해당 문자열을 거꾸로 뒤집은 문자열을 반환하는 함수
	 public static String reverse(String getRandom) {
		 
		 
		int reverse = getRandom.length();
		
		for (int i = reverse - 1; i >= 0; i--) {
			System.out.print(getRandom.charAt(i));
		
		}
		 return  "\n";
	 }
	 
	//3. 문자열을 전달하면 해당 문자열의 좌우대칭 여부를 반환하는 함수
	 
	  public static boolean isSymmetry(String str) {
		  
		  for (int i = 0; i < str.length(); i++) {
			  char ch1 = str.charAt(i);
			  char ch2 = str.charAt(str.charAt(i) - i - 1);
			  if( ch1 != ch2) {
				  return false;
			  }
		  }
		  return true;
	  }
	
	//4. 함수를 호출하면 1~45 사이의 중복없는 숫자 7개로 이루어진 배열을 반환하는 함수




	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.print(text ("dd"));
		System.out.print(reverse ("apple"));
		System.out.print(text ("ABlBA"));
		
	}
}