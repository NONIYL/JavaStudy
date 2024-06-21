package yelim_book;

public class C01_Metherd {
	
	int add (int num1, int num2) {
		int result;
		result = num1 + num2;
		return result; //결과값 반환
	}
	//매개변수가 필요없는 경우
	int getTenTotal() {
		int i;
		int total = 0;
		for(i = 1; i <= 10; i++) {
			total += i;
		}
		//return문이 for문 밖에 있는 이유: 안에 있으면 반복하지 않고 한 번 반환하고 끝남.
		return total;
	}
	
	//void: 반환값이 없는 함수이다. 반환할 값이 없으므로 비워둬야 하지만 void의 위치는 비워두면 오류가 생긴다
	//이때는 void라는 아무기능없이 비어있는 함수를 사용한다. 
	//void: 비어있다는 의미로 '반환할 값이 없다' 는 뜻의 예약어
	void printGreeting(String name) {
		System.out.println(name + "님 안녕하세요");
		return; // 반환 값 없음
	}
	
	void divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return; // 함수 수행 종료
		} else {
			int result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result + "입니다");
		}
	}
	
	//******************** 함수 호출하고 값 반환하기*******************

		public static void main(String[] args) {
			int num1 = 10;
			int num2 = 20;
			
			//sum --> add()함수 호출
			int sum = add2(num1, num2);
			System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
			
			int sum1 = add3(num1, num2);
			System.out.println(num1 + "-" + num2 + "=" + sum + "입니다.");
			
			int sum2 = add4(num1, num2);
			System.out.println(num1 + "*" + num2 + "=" + num1*num2 + "입니다.");
			
			int sum3 = add5(num1, num2);
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2) + "입니다.");
			
		}
		// 이 자체가 add() 함수 
		//왜 여기 매개변수는 num1,2가 아니라 n1,2야?
		//일단 num1,2는 main()함수의 변수이고, n1,2는 add()함수에서 선언한 새로운 변수다.
		//이 매개변수는 실제 함수로 넘어온 두 값을 받아주는 역할을 한다
		// 그렇기 때문에 함수를 호출할 때 사용하는 변수 이름과 호출되는 함수에서의 변수는 서로 다른 변수이기에
		//이름이 같아(=)도 되고 달라(x)도 된다.
		public static int add2(int n1, int n2) {
			int result = n1 + n2;
			return result; // 결과값 반환
		}
		
		public static int add3(int n1, int n2) {
			int result = n1 - n2;
			return result;
		}
		
		public static int add4(int n1, int n2) {
			int result = n1 * n2;
			return result;
		}
		
		public static int add5(int n1, int n2) {
			int result = n1 / n2;
			return result;
		}
		
		
	
}
