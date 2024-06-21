package quiz;

public class B07_forQuiz {
	
	/*
	  1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	  
	  2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해보세요
	  
	  3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
	  
	  4. 1부터 19까지 모든 숫자를 곱을 구해서 출력해보세요 
	  
	  5. 8999 ~ 4999 사이에 있는 5번째 287의 배수를 출력해보세요
	  
	 =================================================================
	
	public static void main(String[] args) {
		int a;
		
		for (int a = 1000 a <= 2000 a++) {	
        if (a%13 == 0); {
			System.out.println("ddd");
		}
		System.out.println("프로그램 끗!");
		
		*/
		
	/*
	 1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	 
	 //	for (int num = 13; num <= 2000; num += 13) {
    //	if (num>= 1000) {
   //	System.out.printf("%d\n", num);

	 */
	
//	 1. 1000 ~ 2000 사이의 13의 배수를 모두 출력해보세요
	public static void main(String[] args) {
		
		for(int num = 1000; num <= 2000; ++num) {
			if (num % 13 == 0 ) {		
				System.out.printf("%d\n", num);
			}
		}
	 
		
//		2. 50부터 100까지 모든 숫자의 총합을 구해서 출력해보세요
		int total = 0;
		for (int i = 50; i <= 100; ++i) {
			total += i;	
		}
		
	
		
		System.out.println("총합은 " + total);	
		
		
//		 3. 1부터 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력해보세요
		for (int i = 1, printCount = 0; i <= 1000; ++i) {
			
			if (i % 10 == 0) {
				System.out.printf("%6d", i);
				
				++printCount; // 10의 배수를 출력한 횟수를 센다
				
				if (printCount % 8 == 0) {
					System.out.println();
				}
			}		
		}
		System.out.println();
		
		
//		4. 1부터 19까지 모든 숫자를 곱을 구해서 출력해보세요 
			
//		int mul = 1;
//		for (int i = 1; i <= 19; ++i) {
//			mul *= i;
//		}
//		System.out.println("총 곱은 " + mul);
//		
		long total2 = 1;
		for (int i = 1; i <= 19; ++i) {
			System.out.printf("%d x %d = %d\n",
					total2, i, total2 *= i);
		}
		
		
		
//		 5. 4999 ~ 8999 사이에 있는 5번째 287의 배수를 출력해보세요
		
		for (int i = 8999, cnt = 0;  i >= 4999; --i) {
			if ( i % 287 == 0) {
				++cnt;
				
				if (cnt == 5) {
					System.out.printf("[%d번쨰 287의 배수: %d]\n ", cnt, i);
				} else {
					System.out.printf("%d번째 287의 배수: %d\n", cnt, i);
				}
			}
		}									
	}
}		




			




