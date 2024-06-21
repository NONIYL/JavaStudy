package myobj;

//public class GraduateDay {
//	int month;
//	int day;
//	int holiday;
//	
//	public GraduateDay(int month, int day, int holiday) {
//		this.month = month;
//		this.day = day;
//		this.holiday = holiday;
//		
//		
//	}
	
	import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

	public class Main {
	    public static List<String> calculateBreakDays(String startDate, int classDays) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate start = LocalDate.parse(startDate, formatter);
	        List<String> breakDays = new ArrayList<>();
	        int daysCounted = 0;
	        LocalDate currentDate = start;
	        
	        while (daysCounted < classDays) {
	            if (currentDate.getDayOfWeek().getValue() >= 6) { // 6: Saturday, 7: Sunday
	                breakDays.add(currentDate.format(formatter));
	            } else {
	                daysCounted++;
	            }
	            currentDate = currentDate.plusDays(1);
	        }
	        
	        return breakDays;
	    }

	    public static void main(String[] args) {
	        String startDate = "2023-09-01";
	        int classDays = 10;
	        
	        List<String> breakDays = calculateBreakDays(startDate, classDays);
	        System.out.println("쉬는 날: " + breakDays);
	    }
	}
	
	

