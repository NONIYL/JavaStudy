package quiz;

import java.util.Scanner;

public class B11_Prime {

	/*
	  사용자가 정수를 입력하면
	  1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해보세요
	  
	  ※ 소수(prime): 약수가 1과 자기 자신밖에 없는 수
	    (2, 3, 5, 7, 11, 13, ..)
	    
	    
	   	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int i = 2, j;
		boolean prime = true;
		
		while (i < input) {
			prime = true;

			j = 2;
			while (j < i) {
				if (i % j == 0) {
					prime = false;
					break;
				}
				j++;
			}

			if (prime) {
				System.out.printf("%d\n", i);
			}
			i++;
================================================================================	 

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int targetNum = sc.nextInt();
		int yaksuCount = 0;
		
		
//		int targetNum = 100;
//		int yaksuCount = 0;
//		i = checkNum j = divider

		// 2부터 사용자가 입력한 숫자까지 있는 모든 숫자의 약수 개수를 체크한다
		// 해당 숫자의 약수가 2개라면 그 숫자는 소수다
		for (int i = 2; i <= targetNum; ++i) {
			System.out.print(i + ": [");
			for (int j = 1; j <= i; ++j) {
				// 각 숫자의 약수를 찾아서 개수를 센다
				if (i % j == 0) {
					if (j != i) {
						System.out.print(j + ", ");
					} else {
						System.out.print(j + "]\n");
					}
					++yaksuCount;
				}
			}
			if (yaksuCount == 2) {
				System.out.print(" *소수");
			}
			System.out.println();
			}
			}
		
=============================================================================
*/
		// 해당 숫자에 1과 자기 자신을 제외한 후 나누어 봤을때 
		// 숫자로 나누어 떨어지는 숫자가 존재한다면 소수가 아니다 
	

//	    public static void main(String[] args) {
//		 int cnt = 0;
//		 int num = 100;
//		 
//		 for ( int i = 2; i <= num; ++num) {
//			 for (int j = 2; j <= num; ++j) {
//			 if ( i % j == 0) {
//				 if ( i != 1) {
//				 ++cnt;
//			 }
//				 if(cnt == 1) {
//					 System.out.print( num + "");
//				 }
//			 }
//		
//		 }
//		 
//	 public static void main(String[] args) {
//		 Scanner sc = new Scanner(System.in);
//			int targetNum = sc.nextInt();
//
//		 
//		 for (int checkNum =2; checkNum <= targetNum; ++checkNum) {
//			 boolean isPrime = true;
//			 
//			 System.out.print(checkNum + " \t: ");
//			//1과 자기자신을 제외한 모든 숫자로 나눠본다
//			 // (2부터 체크하는 숫자의 제곱근까지 나눠본다)
//			 for (int divider = 2; divider < checkNum; ++divider) {
//				 // 나누어 떨어지는게 하나라도 존재한다면 더 이상 소수가 아니므로
//				 // 검사를 그만둔다
//				if (checkNum % divider == 0) {
//					 isPrime = false;
//					 break;
//				 }
//			 }
//			 
//			 if (isPrime) {
//				 System.out.println("소수");
//			 } else {
//				 System.out.println("x");
//				 
//			 }
//		 }
	
		 
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.print("입력> ");
				int num = sc.nextInt();
				
			for (int i = 2; i <= num; ++i) {
				boolean isPrime = true;
				
				 System.out.print(num + "  : ");
				 for (int j =2; j < i; ++j) {
					 if (i % j == 0) {
						 isPrime = false;
						 break;
					 }
				 }
			
				 if (isPrime) {
					 System.out.println("소수");
				 } else {
					 System.out.println("x");
				 }
			
			}
		}
}
		

