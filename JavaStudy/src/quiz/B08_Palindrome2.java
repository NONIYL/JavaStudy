package quiz;
import java.util.Scanner;

public class B08_Palindrome2 {


	public static void main(String[] args) {

		// 원래 단어와 거꾸로 뒤집은 단어가 같으면 좌우대칭

		Scanner sc = new Scanner(System.in);
		
		String word =sc.nextLine();

		int len = word.length();

		String reversed = "";
		for(int i = 0; i < len; i++) {
			reversed += word.charAt(len - i - 1);
		}
		
		System.out.println(word.equals(reversed));
		
	}
}
