package myobj.prizedraw연습;

public class prize뻘짓한거 {

	String applewatch;
	String airfryer;
	String minifan;
	String tissue;
	// 190

	public void prizeQuantity() {
		int appleWatch = 10;
		int airFryer = 20;
		int miniFan = 60;
		int tissue = 100;

	}

	String[] prize1 = { "appleWatch", "airFryer", "miniFan", "tissue" };

	public int kindprize = prize1.length;

	public int prize;

	public prize뻘짓한거() {
		prize = (int) (Math.random() * prize1.length);

	}

	// applewatch> airfryer > minifan > tissue

	public static void main(String[] args) {
		int appleWatch = 10;
		int airFryer = 20;
		int miniFan = 60;
		int tissue = 100;

		System.out.println(appleWatch > airFryer);
		System.out.println(airFryer > miniFan);
		System.out.println(miniFan > tissue);

	}

}

// # equals(obj)  이거 사용해서 뭐가 더 보유치가 있는지 설명할수있나..?ㅅㅂ모르겟노
//equals()