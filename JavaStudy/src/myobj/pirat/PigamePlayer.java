package myobj.pirat;

public class PigamePlayer {

	String name;
	int rating;
	int money;
	int surviveCount;

	final static int MIN_RATING = 3000;

	public PigamePlayer(String name) {
		this.name = name;
		rating = 10000;
		money = 5000;

	}

	public void addmoney(int money) {
		this.money += money;

	}

	public void losemoney(int money) {
		this.money -= money;
	}

	public void ratingUp(int amount) {
		this.rating += surviveCount * amount;

	}

	public void ratingDown(int amount) {
		this.rating -= amount;
		
	}

	public void survive() {
		++this.surviveCount;
	}

	public void resetSurvive() {
		this.surviveCount = 0;

	}
	
	public void print() {
		System.out.printf("[%s, 점수:%d, 소지금:%d)]\n",
				this.name, this.rating, this.money);
	}
	
	public void print(int money) {
		this.money += money;
		System.out.printf("[%s, 최종점수:%d, 소지금:%d(%+d)]\n",
				this.name, this.rating, this.money);
	}
}
