package requiz;

import java.util.Scanner;

public class B07_forquiz3 {

	public static void main(String[] args) {

		/*
		  사용자로부터 숫자를 입력받으면 0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한 줄에 6개씩 출력해보세요 (단, 음수를 입력 받는
		  경우에도 올바르게 동작해야 함
		
		 */
		
		//사용자로부터 입력을 받기 위한 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		
		// 사용자가 입력할 수 있는 입력기 생성 
		System.out.print("숫자입력: ");
		
		// 사용자의 입력을 받기 위한 메서드
		int input = sc.nextInt();
		
		//기본적인 abs(): 음수를 양수로 변경, 양수는 그대로 표시하여 절대값을 리턴해줌
		//int나 long의 경우, 최소음수인 경우에는 절대값이 아닌 음수롤 그대로 리턴해줌
		int num = Math.abs(input);

		//절대값으로 바꾼 num(input)까지 반복문 진행
		for(int i = 0, cnt = 0; i <= num; ++i) {
			
			//만약에 i값을 3의 배수로 나눈게 0과 같다면
			if (i % 3 == 0) {
				
				//3의 배수로 나눌때마다 카운트 센다
				++cnt;
				
				
				//입력받은 input값이 0보다 작을경우, 음수일경우 
				if(input < 0) {
					
					// -i, 즉 음수값을 프린트한다
					System.out.printf("%d\t", -i);
					//그밖에
				} else {
					//음수값이 아닐 경우! i, 즉 양수값을 프린트 한다  
					System.out.printf("%d\t", i);
				}
				
				// 3의 배수를 셌던 값을, 6줄로 나누고 싶을때
					if(cnt % 6 == 0) {
					
					//6줄로 출력
						System.out.println();
					
					
				}
			}

		}

	}
}