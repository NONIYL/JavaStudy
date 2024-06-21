package example;


//자식 클래스는 반드시 부모 클래스의 생성자를 먼저 호출해야 한다
public class RedOrange extends Orange {
	//생략 가능한
	public RedOrange() {
		super(990, 5);
	}
	public RedOrange(int price) {
//		price
	}
}
