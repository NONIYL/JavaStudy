package quiz;
import java.util.Scanner;

public class B08_CountE {
	
	/*
		사용자가 문장을 입력하면 해당 문장에 포함된
		알파벳 e의 개수를 출력하는 프로그램을 만들어보세요
		(* 대/소문자 모두 개수에 포함)
    */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력해주세요> ");
		String text = sc.nextLine();
		
		//e의 갯수를 셀 변수
		int cnt = 0;
		//받은 문장을 읽음
		int len = text.length();
		//문장을 반복
		for(int i = 0; i < len; ++i) {
			//입력한 문장을 char문의 ch에 넣어줌  
			char ch = text.charAt(i);
			// 문장중 e 또는 E가 있다면 
			if(ch == 'e' || ch == 'E') {
				//있는 만큼 센다
				++cnt;
			
			}
		}
		//결과적으로 센 e의 개수 출력
		System.out.printf("%d개 들어있습니다" , cnt);
	}
}