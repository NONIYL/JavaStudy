package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {
	/*
	 * 사용자로부터 몇 월인지 입력받으면 해당하는 계절을 출력해보세요 (switch-case문, if문으로 한 번씩 만들기)
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String seasonName;

		System.out.print("월 입력: ");
		int month = sc.nextInt();

		switch (month) {
		default:
			seasonName = "없는 달";
			break;
		case 11, 12, 1, 2:
			seasonName = "겨울";
			break;
		case 3, 4:
			seasonName = "봄";
			break;
		case 5, 6, 7, 8:
			seasonName = "여름";
			break;
		case 9, 10:
			seasonName = "가을";
			break;
		}

		System.out.printf("%d월은 %s입니다.\n", month, seasonName);

		if (month == 3 || month == 4) {
			seasonName = "봄";
		} else if (month >= 5 && month <= 8) {
			seasonName = "여름";
		} else if (month == 9 || month == 10) {
			seasonName = "가을";
		} else if (month == 11 | month == 12 || month == 1 || month == 2) {
			seasonName = "겨울";
		} else {
			seasonName = "없는 달";
		}

		System.out.printf("%d월은 %s입니다.\n", month, seasonName);

		System.out.print("월을 입력(영어): ");
		String monthName = sc.next();

		switch (monthName.toLowerCase()) {
		case "sep", "oct":
			seasonName = "Fall";
			break;
		case "nov", "dec", "jan", "feb":
			seasonName = "Winter";
			break;
		case "mar", "apr":
			seasonName = "Spring";
			break;
		case "may", "jun", "jul", "aug":
			seasonName = "Summer";
			break;
		default:
			seasonName = "Invalid Month";
			break;
		}

		System.out.printf("%s is %s in Korea\n", monthName, seasonName);

		String monthName2 = monthName.toLowerCase();
		if (monthName2.equals("nov") || monthName2.equals("dec") || monthName2.equals("jan")
				|| monthName2.equals("feb")) {
			seasonName = "Winter";
		} else if (monthName2.equals("mar") || monthName2.equals("apr")) {
			seasonName = "Spring";
		} else if (monthName2.equals("may") || monthName2.equals("jun") || monthName2.equals("jul")
				|| monthName2.equals("aug")) {
			seasonName = "Summer";
		} else if (monthName2.equals("sep") || monthName2.equals("oct")) {
			seasonName = "Fall";
		} else {
			seasonName = "Invalid Month";
		}
		System.out.printf("%s is %s in Korea\n", monthName, seasonName);

	}
}
