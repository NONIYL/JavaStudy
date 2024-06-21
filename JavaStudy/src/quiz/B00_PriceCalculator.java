package quiz;

import java.util.Scanner;

public class B00_PriceCalculator {

	/*
	 * 4가지 음료수 개수를 입력하면 총 가격을 출력해보세요 (각 음료수의 가격은 2300, 2800, 3300, 3500)
	 */

	public static void main(String[] args) {

		int price1 = 2300;
		int price2 = 2800;
		int price3 = 3300;
		int price4 = 3500;

		Scanner sc = new Scanner(System.in);

		System.out.printf("첫 번째 음료: %d원\n", price1);
		System.out.printf("두 번째 음료: %d원\n", price2);
		System.out.printf("세 번째 음료: %d원\n", price3);
		System.out.printf("네 번째 음료: %d원\n", price4);
		System.out.print("음료수 개수 입력 >> ");

		int qty1 = sc.nextInt();
		int qty2 = sc.nextInt();
		int qty3 = sc.nextInt();
		int qty4 = sc.nextInt();

		System.out.printf("첫 번째 음료: %d개\n", qty1);
		System.out.printf("두 번째 음료: %d개\n", qty2);
		System.out.printf("세 번째 음료: %d개\n", qty3);
		System.out.printf("네 번째 음료: %d개\n", qty4);

		int totalPrice = (price1 * qty1) + (price2 * qty2) + (price3 * qty3) + (price4 * qty4);

		System.out.println(totalPrice);

		sc.close();
	}
}
