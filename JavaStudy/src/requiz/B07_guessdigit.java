package requiz;

import java.util.Scanner;

public class B07_guessdigit {
	

	/*
	 	(1) 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int temp = num;
		int cnt = 0;
		
		if (num == 0) {
			System.out.println( num + "는 1자리 숫자입니다.");
		} else if (num < 0) {
			num = -num; //음수일 경우 양수로 변환
			while (num > 0) {
				num /= 10;
				cnt++;
			}
			System.out.printf("%d는 %d자리 숫자입니다", num, cnt);
		} else {
			while (num > 0) {
				num /= 10;
				cnt++;
			}
			System.out.printf("%d는 %d자리 숫자입니다", temp, cnt);
		}
	}

}
