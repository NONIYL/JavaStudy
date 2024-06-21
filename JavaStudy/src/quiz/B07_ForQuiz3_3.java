package quiz;
import java.util.Scanner;
public class B07_ForQuiz3_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		
		/*
		 	
		 	for (int i = 0, cnt = 0; i <= Math.ads(num); ++i){
		 	if (i % 3 == 0) {
		 		if (num < 0) {
		 			System.out.printf("%+d\t", -i);
		 		} else {
		 			System.out.printf("%+d\t", i);
		 		}
		 		
		 		if (++cnt % 6 == 0) {
		 			System.out.println();
		 		}
		 	}
		}	
		 	
		 */

		if(num > 0) {
		for (int i = 0, cnt = 0; i <= num; ++i) {
			if ( i % 3 == 0) {
				// 정수와 문자 타입을 더하면 문자 코드값과 정수값을 더해버린다
				// 문자 타입도 이어붙히기를 하기 위해서는 문자열과의 +가 필요하다
				System.out.print("" + i + '\t');
				
				if (++cnt % 6 == 0) {
					System.out.println();
					
				}
			}
		}

		} else {
		for (int i = 0, cnt = 0; i <= num; --i) {
			if ( i % 3 == 0) {
				
				System.out.print("" + i + '\t');
				
				if (++cnt % 6 == 0) {
					System.out.println();
	
				
					}	
				}
			}
				
		}
	}
}