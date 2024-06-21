package example;

import java.util.Scanner;

public class OvenTimer {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int ct = sc.nextInt();

		int tn = min + ct;
		
		if (tn >= 60) {
			hour = (hour + tn / 60) % 24;
			tn %= 60;
		}
		
		System.out.printf("%d %d", hour, tn);	
	}
	
}
