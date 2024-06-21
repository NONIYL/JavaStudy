package myobj.BlackJack연습;

public class player {

	String name;
	int money;

	public player(String name) {
		this.name = name;
		money = 2500;

	}
	
	public void addmoney(int money) {
		this.money += money;
	}
	
	public void losemoney(int money) {
		this.money -= money;
	}
	
	public void print() {
		System.out.printf("[%s, 소지금: %d]\n",
				this.name, this.money);
	}
	
	public void print(int money) {
		this.money += money;
		this.money -= money;
		System.out.printf("[%s, 최종 소지금: %d(%+d)]\n",
				this.name, this.money, this.money);
	}
	

}

// 상대가 배팅한 만큼의 돈을 따먹어야하자나