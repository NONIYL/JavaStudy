package requiz;
import java.util.Random;
public class A02_Random_swapValue {
	
	/*
	 a에 원래 보관된 값: 9
	b에 원래 보관된 값: 14
	교환 후 a에 보관된 값: 14
	교환 후 b에 보관된 값: 9
	
	 */

	
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int a = random.nextInt(30);
		int b = random.nextInt(30);
		
		System.out.println("값을 입력 하세요: " + a);
		System.out.println("값을 입력 하세요: " + b);

		int c = a;
		
		a = b;
		b = c;
		
		System.out.println("a에 보관된 값: " + a);
		System.out.println("b에 보관된 값: " + b);
		
		
		
		
		
		
		
	}
}
