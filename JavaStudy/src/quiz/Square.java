package quiz;

import java.util.Scanner;
public class Square {

	/*
	 
	 ※ 직사각형의 넓이를 계산하고 출력하시오
	
	[조건]
	 
	▷ 문자열 변수로 직사각형 이름 입력받기
	▷ 실수형 변수로 가로, 세로 길이 입력받기
	▷ 이름과 넓이 출력하기
	(이름에 쌍따옴표 넣고 넓이는 소수점 2자리까지 출력 printf 활용)
	▷ 넓이가 100초과 500미만이라면 true 출력
	  
	 */
	
	
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름: ");
		 String name = sc.next(); 
		
		 System.out.print("가로: ");
		 double w = sc.nextDouble();
		
		 System.out.print("세로: ");
		 double h = sc.nextDouble();
		 
		 double e = (w * h);
		 
		 System.out.printf( " \"%s\" 직사각형의 넓이 %.2f\n ", name, e);
		 
		 System.out.println(e > 100 && e < 500);
		 
		 /*
		  
		   public static void main(String[] args) {
		   
		   String name = "철수";
		   double width =  123.123;
		   double height = 12.233;
		   double area = Math.round(width * height * 100) / 100.0;
		   
		   System.out.println(area);
		   System.out.prinf("\"%s\" 직사각형 넓이는 %.2f\n", name, area);
		  
		  ->  지정값의 경우
		  
		  
		  */
		 
		 
		 sc.close();
		 
		
		 
		
		 
	 }
}
