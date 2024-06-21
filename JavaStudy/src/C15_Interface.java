
public class C15_Interface {
	
	/* 
	 	# 인터페이스(Interface)
	 	
	 	- 추상 클래스처럼 내부에 추상 메서드를 지닐 수 있는 것
	 	- 추상 클래스는 하나 밖에 상속받지 못하지만 인터페이스는 여러개 구현받을 수 있다
	 	- 인터페이스 내부에 선언하는 매서드는 모두 자동으로 public abstract가 된다
	 	- 인터페이스 내부에 선언하는 변수들은 자동으로 final static이 된다
	 	- 인터페이스는 인스턴스화 하는것이 불가능하다
	 	- 인터페이스는 클래스에게 특정 성질을 부여하기 위해 사용한다
	 	  Serializeble -> 직렬화가 가능한 객체가 된다
	 	  Comparable -> 비교가 가능한 객체가 된다
	 	- 추상 클래스는 인스턴스 영역이 존재하지만 인터페이스에는 인스턴스 영역이 아예 없다
	 	- 추상 클래스는 하나 밖에 상속받지 못하지만 인터페이스는 여러개 구현받을 수 있다
	 	
	 */

	public static void shuffle(Shufflable obj) {
		obj.shuffle();
	}
	
	public static void main(String[] args) {
		shuffle(new PirateBarrel());
		shuffle(new oneCardGame());
		
	}
}
//abstract class -> interface
interface Swimmer {
	//interface 내부의 메서드는 자동적으로 public abstract가 된다 
	abstract void swim();
}
interface Runner {
	abstract void run();
}

class Whale implements Swimmer {
	//이녀석의 내부에는 수영이 가능한 객체가 존재하고 있다
	@Override
	//Cannot reduce the visibility of the inherited method from Swimmer : public을 붙이지 않았을때 
	public void swim() {
		System.out.println("고래는 수영을 아주 잘합니다.");
	}
}

class Turtle implements Swimmer, Runner {
	//원래 extends로는 수영 또는 달리기 하나만 부여받기 가능했음. 
	//하지만 implements는 두 속성 다 동시에 부여받기 가능

	@Override
	public void run() {
		System.out.println("거북이는 매우 느립니다.");
	}

	@Override
	public void swim() {
		System.out.println("거북이는 수영을 잘 합니다.");
		
	}
	
}
// 이 인터페이스를 구현한 객체들은 반드시 shuffle()을 가지고 있다
//( 이 인터페이스를 구현한 객체들은 섞을 수 있다)
interface Shufflable {
	void shuffle();
}

// 해적통은 shufflable 인터페이스를 구현받았으므로 반드시 shufflable()을 가지고 있다
//(해적통은 shufflable 인터페이스를 구현받았으므로 섞을 수 있는 객체가 되었다)
class PirateBarrel implements Shufflable {
	int[] barrels = new int[20];

	@Override
	public void shuffle() {
	//셔플해보세요..	
	}
}
class oneCardGame implements Shufflable {
	@Override
	public void shuffle() {
	
}
}

