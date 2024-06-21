package quiz;

public class C04_CountFishBread {

	/*
	  
	  1. 붕어빵 클래스를 만들어 보세요
	  
	  - 붕어빵의 속성은 맛, 가격, 품질이 있다 
	  - 맛과 품질은 인스턴스 생성시 랜덤으로 결정됨 
	  - 가격은 팥 800원, 슈크림 1000원, 피자 1200원이고 품질에 따라 +-100원이 된다 (품질은 상/중/하)
	  
	  2. 설계한 클래스를 활용하여 붕어빵을 100개 만들고 어떤 맛 붕어 빵이 몇 개 있는지 세어보세요
	  
	  3. n개의 붕어빵 배열을 전달하면 모든 붕어빵의 가격이 얼마인지 계산해주는 함수를 만들어보세요
	  
	 */

	class Fishbun {

		int price;

		static int price_redbean = 800;
		static int price_sucream = 1000;
		static int price_piza = 1200;

		public Fishbun(int price, String taste, String quality) {
			this.price = price;
		}

		static void setFishBunPrice(int price) {
			Fishbun.price_redbean = price_redbean;
			Fishbun.price_sucream = price_sucream;
			Fishbun.price_piza = price_piza;

		}

		static void printFishbunInfo() {
			System.out.println("팥 붕어빵의 가격: " + price_redbean);
			System.out.println("슈 붕어빵의 가격: " + price_sucream);
			System.out.println("피자 붕어빵의 가격: " + price_piza);

		}

	}

	public static void main(String[] args) {
		
		

	}
}

class Fishbun2 {

	int variablePrice;
	int taste;
	int quality;

	String[] tastelist = { "팥", "슈", "피자" };
	char[] qualitylist = { '상', '중', '하' };

	

}
