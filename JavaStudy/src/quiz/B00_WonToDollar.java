package quiz;
import java.util.Scanner;

public class B00_WonToDollar {
	
	/*
	 	한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
	 	(현재 환율은 검색)
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한국돈 입력: ");
		int krw = sc.nextInt();
		
		double exchangeRate = 1374.80;
		
		double usd = krw / exchangeRate;
		
		System.out.printf("환율: %.2f원\n달러: $%.2f", exchangeRate, usd );
		
		sc.close();
	}
}
