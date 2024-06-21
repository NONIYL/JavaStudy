package requiz;

import java.util.Scanner;

public class B04_applequiz {

	/*
	  사과를 10개씩 담을 수 있는 바구니가 있을 때, 사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는
	  프로그램을 만들어보세요
	 */

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("사과의 개수를 입력하세요> ");
	
	int apple = sc.nextInt();
	int basketsize = 10;
	int basket;
	
	if (apple < 0) {
		System.out.println("※경고: 사과의 개수가 이상합니다.");
		basket = -1;
	} else if(apple % basketsize > 0) {
		basket = apple / 10 + 1; // 10개가 넘으면 바구니 +1개가 더 필요하다는 의미로 넣음
	} else {
		basket = apple / 10;
	}
	
	if (basket != -1) {
		System.out.printf("사과 %d개를 담기 위해 필요한 바구니의 개수는"
				+ "%d개 입니다." , apple, basket);
	} else {
		System.out.println("시스템 오류입니다.");
	}

  }

}
