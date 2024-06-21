
public class C06_Extend {

	/*
	  # 클래스 상속
	  
	  - 이미 만들어져 있는 클래스를 그대로 물려받아 사용하는 문법 
	  - 자식 클래스는 부모로부터 모든 변수와 메서드를 물려받아 (1)그대로가지고 있다
	  - 자식 클래스는 부모로부터 물려받은 변수 및 기능을 (2)마음대로 고쳐서 사용할 수 있다 (오버라이드, override) 
	  - 자식 클래스에는 부모 클래스에는 없는 기능을 새로 추가해서 사용할 수 있다
	  - 상속시 자식클래스에서는 반드시 부모 클래스의 생성자를 가장 먼저 호출해야 한다
	  
	  # super 
	  
	  - 자식 클래스로 생성된 인스턴스의 부모 부분을 의미한다
	  - 자식 클래스에서 this는 자식 클래스 자신만을 의미한다
	  - 자식 클래스와 부모 클래스에서 같은 이름을 가지고 있는 자원을 구분하기 위해서 사용한다.
	  - this()는 현재 클래스의 생성자를 의미하고 super()는 부모 클래스의 생성자를 의미한다
	  
	 */
	public static void main(String[] args) {

		Wolf w0 = new Wolf();
		Wolf w1 = new Wolf("늑돌이");
		Wolf w2 = new Wolf("늑순이");

		w0.pet();
		w1.pet();
		w2.pet();
		w0.run();

		// wolf 클래스를 상속받은 Dog클래스에 wolf의 기능이 그대로 들어있다
		Dog d1 = new Dog();

		d1.pet();
		d1.run();

		
//		YLcafe c1 = new YLcafe("선택");
		

//		c1.coffee();
//	
//		c1.dissert();
//
//		c1.tea();
//		
	}
}

class Wolf {
	String name;
	int age = 0;

	public Wolf() {
		name = "이름없는늑대";
	}

	public Wolf(String name) {
		this.name = name;
	}
	//만약에 여기서 final을 붙이면 이제 손이 물리는 선택지를 피하지 못하게 됨
	void pet() {
		System.out.printf("늑대(%s,%d세)를 쓰다듬다가 손이 물렸습니다.\n", this.name, this.age);
	}

	void run() {
		System.out.printf("%s가 열심히 달립니다!\n", this.name);
	}
}

class Dog extends Wolf {

	int walkDesire=100;
	String socialId;
	
	public Dog() {
		super("이름없는개");
	}
	
	public Dog(String name) {
		super(name);
	}
		
	public Dog(String name, String socialId) {
		super(name);
		this.socialId = socialId;
		
	}

	// 부모 클래스에 있는 똑같은 이름의 메서드를 자식 클래스에 만들 수 있다
	void pet() {
		System.out.printf("강아지(%s, %d세)를 쓰다듬었더니 아주 좋아합니다\n", this.name, this.age);
	}

	void walk() {
		System.out.printf("강아지(%s, %d세)와 함께 산책했습니다!\n", this.name, this.age);
		walkDesire -= 10;
	}
	
	@Override
	public String toString() {
		return "강아지(" + name + "/" + age + "세)";
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Dog)) {
			return false;
		}
		return this.socialId.equals(((Dog)obj).socialId);
	}
	
	@Override
	public int hashCode() {
		
		//String은 hashCode() 메서드 오버라이드 해놓은 클래스다
		return socialId.hashCode(); 
	}

/*
 * 상속 관계에 있는 클래스의 예시를 한번 작성해보세요
 * 
 */

class YLcafe {
	String type;
	int coffee = 2000;
	int cake = 4000;
	int tea = 1500;

	public YLcafe(String type) {
		this.type = type;
	}

	void coffee() {
		System.out.printf("%s => %d 커피를 결제하였습니다.\n", this.type, coffee);
	}

	void dissert() {
		System.out.printf("%s => %d 케이크를 결제하였습니다.\n", this.type, cake);
	}

	void tea() {
		System.out.printf("%s => %d 녹차를 결제하였습니다.\n", this.type, tea);
	}
}

class Building {
	double progress;
	
	// super 엄마는 여기에 숨어있음~@!
	void purchasebuild() {
		progress += 5.5;
	}
}

class purchaseBuilding extends Building{
	//상속받은 자식 클래스는 반드시 부모의 생성자인 super()를 가장 먼저 호출해야 한다
	//하지만, 기본 생성자는 생략이 가능하기 때문에 안 적는 것 처럼 보이는 경우도 있다 ☆☆ // C03_constructor 설명 참조 
	public purchaseBuilding() {
		super(); // 설명참조부분 왜 super는 그냥 호출이 되있을까? 부모가 없는데?
		int a = 10;
	}
	void purchase() {}
	void sell() {}
}

class UpgradeBuildling {
	void upgrade() {}
}

class CreationBudlin {
	void creat() {}
}
}