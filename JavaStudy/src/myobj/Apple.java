package myobj;


public class Apple {
	public 
	
	int price;
	double weight;
	
	// 이 생성자를 통해 만들어지는 사과 인스턴스들은 이 초기값을 갖게 된다
	// 가격은 1000, 무게는 5가 된다
	public Apple() {
		price = 1000;
		weight = 5;
	}
	public Apple (int price) {
		this.price = price;
		weight = 10;
	}
	//이 생성자를 통해 만들어지는 인스턴스들은 가격 1500원무제근 받은걸로 채우겠다
	public Apple(double weight) {
		price = 1500;
		this.weight = weight;
	}
	public Apple(int price, double weight) {
		this.price = price;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("사과" + this + "의 가격: " + price);
		System.out.println("사과" + this + "의 무게: " + weight);
	}
}
