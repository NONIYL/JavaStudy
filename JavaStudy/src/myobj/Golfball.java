package myobj;

public class Golfball {

	 int weight;
	 int color;
	 int pattern;
	 
	 
	 static int ball_weight = 5;
	 
	 public Golfball(int weight, int color) {
		 this.weight = weight;
		 this.color = color;
		 this.pattern = pattern;
	 }
		static void printballInfo() {
			System.out.println("골프공의 무게: " + ball_weight);	
		}


		public static void main(String[] args) {	
			
			String colorA = "black"; 
			String pattenA = "wave";
		

			Golfball color = new Golfball(0, 0);
			Golfball patten = new Golfball(1, 0);
			
			System.out.println("골프공의 색깔과 무게: " + colorA + "\t" + color.ball_weight);
			System.out.println("골프공의 패턴과 무게: " + pattenA + "\t" + patten.ball_weight);
			
//			System.out.printf("골프공의 색깔과 패턴은 %s, %s이고 무게는 %d임" , );
			
			
			
			//주말목표: 입력을 받으면 색깔과 패턴, 무게를 알려주는 골프공 프로그램 만들기
			
			
			

		
		
	}
	
		
		
}