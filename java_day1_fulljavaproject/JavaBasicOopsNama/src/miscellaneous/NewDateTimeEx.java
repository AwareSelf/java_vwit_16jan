package miscellaneous;
// Java code for LocalDate
// / LocalTime Function
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class NewDateTimeEx {
	
	/*
	 * New date-time API is introduced in Java 8 to overcome the following drawbacks of 
	 * old date-time API : 

		Not thread safe : Unlike old java.util.Date which is not thread safe the new date-time API is immutable and doesn�t have setter methods.
		Less operations : In old API there are only few date operations but the new API provides 
		us with many date operations.
		Java 8 under the package java.time introduced a new date-time API, 
		most important classes among them are :  

		Local : Simplified date-time API with no complexity of timezone handling.
		Zoned : Specialized date-time API to deal with various timezones.
		LocalDate/LocatTime and LocalDateTime API : Use it when time zones are NOT required.
	 */
	


	public static void LocalDateTimeApi()
	{
		
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
	
	// Function to get Zoned Date and Time
	public static void ZonedTimeAndDate()
	{
	    LocalDateTime date = LocalDateTime.now();
	    DateTimeFormatter format1 =
	      DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	     
	    String formattedCurrentDate = date.format(format1);
	     
	    System.out.println("formatted current Date and"+
	                      " Time : "+formattedCurrentDate);
	 
	    // to get the current zone
	    ZonedDateTime currentZone = ZonedDateTime.now();
	    System.out.println("the current zone is "+
	                        currentZone.getZone());
	 
	    ZoneId tokyo = ZoneId.of("Asia/Tokyo");
	 
	    // getting time zone of specific place
	    // we use withZoneSameInstant(): it is
	    // used to return a copy of this date-time
	    // with a different time-zone, 
	    // retaining the instant.
	    ZonedDateTime tokyoZone =
	            currentZone.withZoneSameInstant(tokyo);
	                   
	    System.out.println("tokyo time zone is " +
	                        tokyoZone);
	 
	    DateTimeFormatter format =
	        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	     
	    String formatedDateTime = tokyoZone.format(format);
	 
	    System.out.println("formatted tokyo time zone "+
	                        formatedDateTime);
	     
	}
	

	// Java code for period and duration
	/*
	 * Period and Duration classes : 
	   Period : It deals with date based amount of time. 
	   Duration : It deals with time based amount of time.
	 */
	 	public static void checkingPeriod()
	    {
	        LocalDate date1 = LocalDate.now();
	 
	        LocalDate date2 =
	            LocalDate.of(2022, Month.APRIL, 1);
	 
	        Period gap = Period.between(date2, date1);
	        System.out.println("gap between dates "+
	                           "is a period of "+gap.getDays()+" days...");
	        
	        System.out.println("gap between dates "+
                    "is a period of "+gap.getMonths()+" months...");
	        
	        
	    }
	 
	    // Function to check duration
	    public static void checkingDuration()
	    { 
	 
	        LocalTime time1 = LocalTime.now();
	        System.out.println("the current time is " +
	                            time1);
	 
	        Duration fiveHours = Duration.ofHours(5);
	 
	        // adding five hours to the current
	        // time and storing it in time2
	        LocalTime time2 = time1.plus(fiveHours);
	        
	      
	 
	        System.out.println("after adding five hours " +
	                           "of duration " + time2);
	 
	        Duration gap = Duration.between(time2, time1);
	        System.out.println("duration gap between time1" +
	                           " & time2 is " + gap);
	}
	    
	    //ChronoUnits Enum : java.time.temporal.ChronoUnit enum is added in Java 8 to 
	    //replace integer values used in old API to represent day, month etc.
	 
	     // Function to check ChronoUnit
	    public static void checkingChronoEnum()
	    {
	        LocalDate date = LocalDate.now();
	        System.out.println("current date is :" +
	                            date);
	     
	        // adding 2 years to the current date
	        LocalDate year =
	             date.plus(2, ChronoUnit.YEARS);
	         
	        System.out.println("next to next year is " +
	                            year);
	             
	        // adding 1 month to the current data
	        LocalDate nextMonth =
	                  date.plus(1, ChronoUnit.MONTHS);
	         
	        System.out.println("the next month is " +
	                            nextMonth);
	     
	        // adding 1 week to the current date
	        LocalDate nextWeek =
	                  date.plus(1, ChronoUnit.WEEKS);
	         
	        System.out.println("next week is " + nextWeek);
	     
	        // adding 2 decades to the current date
	        LocalDate Decade =
	                  date.plus(2, ChronoUnit.DECADES);
	                   
	        System.out.println("20 years after today " +
	                            Decade);
	    }
	    
	    //TemporalAdjuster : It is used to perform various date related operations.
	    // Function to check date and time
	    // according to our requirement
	    public static void checkingAdjusters()
	    {
	 
	        LocalDate date = LocalDate.now();
	        System.out.println("the current date is "+
	                            date);
	 
	        // to get the first day of next month
	        LocalDate dayOfNextMonth =
	              date.with(TemporalAdjusters.
	                        firstDayOfNextMonth());
	     
	        System.out.println("firstDayOfNextMonth : " +
	                            dayOfNextMonth );
	 
	        // get the next saturday
	        LocalDate nextSaturday =
	                date.with(TemporalAdjusters.
	                          next(DayOfWeek.SATURDAY));
	         
	        System.out.println("next saturday from now is "+
	                            nextSaturday);
	 
	        // first day of current month
	        LocalDate firstDay =
	                  date.with(TemporalAdjusters.
	                  firstDayOfMonth());
	                                    
	        System.out.println("firstDayOfMonth : " +
	                            firstDay);
	 
	        // last day of current month    
	        LocalDate lastDay =
	                  date.with(TemporalAdjusters.
	                            lastDayOfMonth());
	         
	        System.out.println("lastDayOfMonth : " +
	                            lastDay);
	    }
	     
	

		// Driver code
		public static void main(String[] args)
		{
			 LocalDateTimeApi();
			 ZonedTimeAndDate();
			 checkingPeriod();
		     checkingDuration();
		     checkingChronoEnum();
		     checkingAdjusters();
		}
	}



