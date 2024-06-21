package requiz;

import java.util.Scanner;

public class B11_prime {
	
	/*
	  사용자가 정수를 입력하면
	  1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	  
	  ※ 소수(prime): 약수가 1과 자기 자신밖에 없는 수
	    (2, 3, 5, 7, 11, 13, ..)
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		int num = sc.nextInt();
		
		for(int i = 2; i <= num; ++i) {
		
			boolean isprime = true;
		
			System.out.print(num + " : ");
			//2부터 사용자가 입력한 숫자까지 모든 숫자의 약수 개수를 체크한다.
			//해당 숫자의 약수가 2개라면 그 숫자는 소수다
			for (int j = 2; j < i; ++j) {
				//각 숫자의 약수를 찾아서 개수를 센다
				if( i % j == 0) {
					isprime = false;
					break;
				}
			}
			
			if (isprime) {
				System.out.println("소수");
			} else {
				System.out.println("x");
			}
		}
	}
}
	
