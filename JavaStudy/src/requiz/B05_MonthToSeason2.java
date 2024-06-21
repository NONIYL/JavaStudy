package requiz;

import java.util.Scanner;

public class B05_MonthToSeason2 {
	
	/*
	 * 사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요 (switch-case문, if문으로 한 번씩 만들기)
	 */

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int month = sc.nextInt();
	String season;
	
	
	switch(month) { 
	 case 3: case 4: case 5:
		 season = "봄";
		 break;
	 case 6: case 7: case 8:
		 season = "여름";
		 break;
	 case 9: case 10: case 11:
		 season = "가을";
		 break;
	 case 12: case 1: case 2:
		 season = "겨울";
		 break;
	 default:
		 season = "없는 달";
	} 
	System.out.printf("%d월은 %s입니다.\n", month, season);
	
	
	System.out.println("=======================================================");
	
	
	
	if ( month == 3 || month == 4 || month == 5 ) {
		season = "봄";
	
	}else if ( month == 6 || month == 7 || month == 8 ) {
		season = "여름";
	
	}else if ( month == 9 || month == 10 || month == 11 ) {
		season = "가을";
	
	}else if ( month == 12 || month == 1 || month == 2 ) {
		season = "겨울";
	} else {
		season = "없는달";
	}
	System.out.printf("%d월은 %s입니다." , month, season);
	
  }
}

