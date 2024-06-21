package requiz;

import java.util.Scanner;

public class B11_Count369withInteger {
	
	/*
 	사용자가 숫자를 입력하면 
 	해당 숫자까지 369게임이 진행됐을 때 박수를 총 몇 번 쳐야하는지 출력해보세요
 	
 	1. 숫자를 문자열로 취급하여 검사하는 방식
 	
 	2. 그냥 숫자로 검사하는 방식
 	   34346 %10 => 1의 자리에 올때까지 나눠
 	   
 	   (1) 왜 i를 직접적으로 while에 넣고 돌리지 못해요
 	
 	
 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		
		int user = sc.nextInt();
		int cnt = 0;
		
		for(int i= 0; i < user; ++i) {
			//i를 빈 변수에 넣는것은 i의 값이 변하는 걸 막기 위해서임
			int num = i;
			
			while(num > 0) {
				
				//user가 입력한 나머지를 알고싶다
				//10을 나눈 나머지(%)를 알기위해 쓰임
				int digit = num % 10;
				
				//0%n 은 다 0으로 나오기 때문에 0을 빼줘야함
				//0제외 3으로 나눈값이 0이 되는 것들은 카운트한다.
				if(digit % 3 == 0) {
					++cnt;				
				}
				//while문 안의 num값이 1의 자리가 될때까지 10으로 계속 나눠준다.
				num /= 10;
			}
		}
		System.out.println(cnt);
	}
}