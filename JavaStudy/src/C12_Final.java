
public class C12_Final {
	
	/*
	 	# final
	 	
	 	- 변수 앞에 final을 붙이면 이후로는 변경할 수 없는 변수가 된다 (상수)
	 	- 메서드 앞에 final을 붙이면 해당 메서드를 오버라이드 하는것이 금지된다
	 	- 클래스 앞에 final을 붙이면 해당 클래스를 상속받는것이 금지된다
	 	
	 */
	
	public static void main(String[] args) {
		final int num = 10;
		final double PI = 3.14;
		
	}

}

//▼ F3을 눌러서 왜 안되는지 확인 해보자, 살펴보면 상속 받을 수 없게 final이 붙어있을것이다
//class MySuperString extends String {
//String은 final Class이기 때문에 익명 상속도 불가능하다
//String str = new String() {};
	

