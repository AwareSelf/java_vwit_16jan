package miscellaneous;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 * 
		 * old way - Date class from util package
		 * 
		 * 
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getDate()+"/"+d.getMonth()+"/"+d.getYear());
		
		 */

		// the current date
		LocalDate date = LocalDate.now();
		System.out.println("the current date is "+
							date);


		// the current time
		LocalTime time = LocalTime.now();
		System.out.println("the current time is "+
							time);
		

		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : "+
							current);


		// to print in a particular format
		DateTimeFormatter format =
		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formatedDateTime = current.format(format);
		
		System.out.println("in formatted manner "+
							formatedDateTime);


		// printing months days and seconds
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		System.out.println("Month : "+month+" day : "+
							day+" seconds : "+seconds);

		// printing some specified date
		LocalDate date2 = LocalDate.of(1950,1,26);
		System.out.println("the republic day :"+date2);
		
		LocalDateTime joinDt = LocalDateTime.of(2022, 4,16, 12,20, 10);
		System.out.println("LocalDateTime:Emp joining date:"+joinDt);

		// printing date with current time.
	    current = LocalDateTime.now();
		LocalDateTime specificDate =
			current.withDayOfMonth(24).withYear(2016);

		System.out.println("manipulate and change parts of current date-time:"+specificDate);

	}

}
