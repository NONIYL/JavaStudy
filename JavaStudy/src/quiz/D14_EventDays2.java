package quiz;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class D14_EventDays2 {
	/*
	 	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주스는 프로그램을 만들어주세요
	 	
	 	1+1 이벤트 : 매월 18일
	 	20% 할인 이벤트 : 홀수번째 주 금요일
	 	구매시 아메리카노 무료 이벤트 : 매주 화요일
	 	
	 	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	 */
	

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();

		int cnt = 0;
		for (int i = 0; i < 365; ++i) {
			if (365 % 18 == 0) {
				System.out.println("[1+1]이벤트: " + i);
			}

			LocalDate eventDay = LocalDate.of(2024, 5, 27);
			LocalDate lasteventDay = eventDay.withDayOfMonth(31).of(2025, 5, 27);

			eventDay.with(TemporalAdjusters.lastDayOfMonth());
			System.out.println(eventDay.with(TemporalAdjusters.lastDayOfMonth()));

		}

	}

}
