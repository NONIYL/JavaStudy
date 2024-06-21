package requiz;

import java.util.Scanner;

public class B11_count369 {
	
	/*
 	사용자가 숫자를 입력하면 
 	해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇 번 쳐야하는지 출력해보세요
 	
 	1. 숫자를 문자열로 취급하여 검사하는 방식
 	
 	2. 그냥 숫자로 검사하는 방식
 	   34346 %10 => 1의 자리에 올때까지 나눠
 	
 */

	public static void main(String[] args) {
		boolean bug = true;

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		int clapCnt = 0;

		//사용자가 입력한 수까지 반복한다
		for (int i = 0; i <= num; ++i) {
			//반복하는 숫자 먼저 출력
			System.out.print(i + ": ");
			
			//출력된 숫자 중 어디 부분에 짝이 들어가야 하는지 알아야 하기 때문에
			// numStr라는 식을 하나 만들어준다
			String numStr = "" + i;
			
			//받은 numStr의 문장길이를 읽을 수 있게 int len으로 받아준다
			int len = numStr.length();
			
			//j = index 박스다.
			//i를 담은 박스에 또 반복문을 돌려준다
			for (int j = 0; j < len; ++j) {
				char ch = numStr.charAt(j);
				//입력한 숫자중에 3,6,9라는 수가 포함되있으면
				if (ch == '3' || ch == '6' || ch == '9') {
					//그것을 센다
					++clapCnt;
					//()가 true일때
					if (bug) {
						//박수를 짝 친다.
						System.out.print("짝");
					}
				}
			}
			if(bug) {
			System.out.println();
			}
		}
		System.out.printf("%d까지 369게임을 진행하면 박수를 총 %d번 쳐야합니다.\n",
				num, clapCnt);

	}
}
