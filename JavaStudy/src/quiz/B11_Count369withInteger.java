package quiz;

import java.util.Scanner;

public class B11_Count369withInteger {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.print("입력> ");
		
		int user = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < user; ++i) {
			int num = i;
			
			int digit = num % 10;
			
			if (digit != 0 && digit % 3 == 0) {
				++cnt;
			}
			num /= 10;
		}
		System.out.println(cnt);
	}
}
		

//		for (int i = 1; i <= inputnum; ++i) {
//			// digit: 자릿수 
//			long digit = 1;
//			while (digit <= 1000000000) {
//				// 한 자릿수 분리 
//				int num = (int)(i / digit % 10); 

// 해당 자릿수 숫자가 0이 아니고 3의 배수이면 박수 획수 증가
//					if (num !=0 && num % 3 == 0) {
//						++cnt;	
//				}				
//				digit *= 10;
//			}
//			System.out.println("박수: " + cnt );
//			
//		}
//		

//			}
//			// 일의자리 체크
//			if (i / 1 % 10 == 3 || i / 1 % 10 == 6 || i / 1 % 10 == 9 ) {
//				++cnt;	
//			}
//			// 십의자리 체크
//			if (i / 10 % 10 == 3 || i / 10 % 10 == 6 || i / 10 % 10 == 9) {
//				++cnt;
//			// 백의자리 체크
//			if (i / 100 % 10 == 3 || i / 100 % 10 == 6 || i / 100 % 10 == 9) {
//				++cnt;
//			}	
//			
