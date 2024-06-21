package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import myobj.KoreanHolidays;

public class D13_GraduateDay {

	private static Calendar cal;

	/*
	 	사용자가 수업을 시작하는 날짜와 수업을 받아야하는 날을 입력하면
	 	수업을 쉬는 날을 모두 출력해주고 수업이 종료되는 날짜도 알려주는 프로그램을 만들어보세요
	 	
	 	쉬는날 - 토, 일, 공휴일(대체 휴일 포함) 
	 	
	 	공휴일 추가 
	 	
	 */
	public static void classSchedule(int year, int month, int date, int period) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date - 1);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-mm-dd(E)");
		int studyDay = 0;
		while (studyDay < period) {
			cal.add(Calendar.DATE,1); //하루 증가
			
			String dateStr = dateFormat.format(cal.getTime());
			
			//증가한 날이 토/일이면 공부한 날이 증가하지 않음
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if ( dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
					System.out.printf("%s는 쉬는날입니다.(%s)\n", dateStr,
							cal.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.KOREAN));
					continue;
				}
			
			//공휴일이면 공부한 날이 증가하지 않음
			if(KoreanHolidays.isHoliday(cal)) {
				System.out.printf("%s는 쉬는날입니다.(공휴일)\n", dateStr);
				continue;
				
			}
				
			System.out.printf("%s는 %d일째 공부하는 날입니다.\n", dateStr, studyDay + 1);
			++studyDay;
		}
		
	}

	public static void main(String[] args) {
		int year = 2024;
		int month = 1;
		int date = 1;
		int period = 300;
		
		classSchedule(year,month,date,period);
		
		
	
		
	}
}