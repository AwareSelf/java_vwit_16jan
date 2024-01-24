package miscellaneous;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTimeOldNewBoth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		//old way
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getDate()+"/"+d.getMonth()+"/"+d.getYear());
		
		//formatting date in old way before 1.8 
		//date - to -string conversion in speicifc format
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		
		String ds = sf.format(d);
		System.out.println("date formatted in old way:date to string in given format:using SimpleDateFormat class: "+ds);
		
		
		String s="2022/04/12"; //suppose accept it from scanner or UI
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse(s);
		System.out.println("old way:parse string in given format and convert it to date object:"+date1);
		
		
		System.out.println("usinf gregorian calendar and Calendar class static fields");
		GregorianCalendar obj = new GregorianCalendar();  
		System.out.println(obj.get(Calendar.DAY_OF_MONTH));
		System.out.println(obj.get(Calendar.DAY_OF_WEEK));
		System.out.println(obj.get(Calendar.HOUR_OF_DAY));
		System.out.println(obj.get(Calendar.DATE));
		
		//create your own date object not just current date
		System.out.println("create your own date 5-april-2022..");
		GregorianCalendar obj1 = new GregorianCalendar(2022,4,5,11,53,10);  
		System.out.println(obj1.get(Calendar.DAY_OF_MONTH));
		System.out.println(obj1.get(Calendar.DAY_OF_WEEK));
		System.out.println(obj1.get(Calendar.HOUR_OF_DAY));
		System.out.println(obj1.get(Calendar.SECOND));
		System.out.println(obj1.get(Calendar.DATE));
		
		
		
		
		
		
		//new way
		System.out.println("new way using java.time classes..");
		LocalDate date = LocalDate.now();
		System.out.println("the current date is "+
							date);
		
		
		LocalTime time = LocalTime.now();
		System.out.println("the current time is "+time);
		
		// will give us the current time and date
		LocalDateTime current = LocalDateTime.now();
		System.out.println("current date and time : "+
							current);
			
		System.out.println("extracting parts of LocalDateTime object:");
		System.out.println(current.getMonthValue());
		System.out.println(current.getYear());
		
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
		
		
		// to print in a particular format
		
		//Step1: create a pattern using DateTimeFormatter
		DateTimeFormatter format = 	DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		//step 2: pass that formatter tp LocalDateTime format method - it will return you date-time-string in specified format
		String formatedDateTime = current.format(format);
		
		System.out.println("in formatted manner "+
							formatedDateTime);

		
	
		
		
	}

}
/*
class Emp
{
	private int empid;
	private LocalDate joiningDate;
	
}
*/
