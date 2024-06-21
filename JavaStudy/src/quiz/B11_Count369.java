package quiz;
import java.util.Scanner;
public class B11_Count369 {
	
	/*
	 	사용자가 숫자를 입력하면 
	 	해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇 번 쳐야하는지 출력해보세요
	 	
	 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 	
	 	2. 그냥 숫자로 검사하는 방식
	 	   34346 %10 => 1의 자리에 올때까지 나눠
	 	
	 */
	
	public static void main(String[] args) {
		boolean DBUG_MODE = false;
			
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		int totalClapCount = 0;
		
		for (int i = 0; i <= num; ++i) {
			System.out.print(i + "\n: ");
			
			String numStr = "" + i;
			
			int len = numStr.length();
			for (int index = 0; index < len; ++index) {
				char ch = numStr.charAt(index);
			if (ch == '3' ||ch == '6'||ch == '9') {
				++totalClapCount;
				if (DBUG_MODE) {
				System.out.print("짝");
			}
		}
	}
		if (DBUG_MODE) {
		System.out.println();
		}
	}
	System.out.printf("%d까지 369게임을 진행하면 박수를 총 %d번 쳐야합니다.\n",
			num, totalClapCount);
	
	}

}
