package example;

public class Orange {
	int price;
	int sweet;
	
	public Orange() {
		this (1000, 8); // this() : 나의 다른 생성자 호출
		//this(); 로 둘 경우 this->Orange 무한반복 -> 자기 자신을 호출하기 때문에
		
	}
	public Orange(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	public void print() {
		System.out.printf("가격: %d, 당도: %d\n", price, sweet);
	}
	
	public static void main(String[] args) {
		Orange o1 = new Orange();
		Orange o2 = new Orange(800, 9);
		
		o1.print();
		o2.print();
		
		RedOrange ro1 = new RedOrange();		
		//레드오렌지의 값을 다른 클래스에서 받아옴
		ro1.print();
		
	}
}

