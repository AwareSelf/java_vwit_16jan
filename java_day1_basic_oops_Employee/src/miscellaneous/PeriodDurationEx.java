package miscellaneous;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class PeriodDurationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Java code for period and duration
		/*
		 * Period and Duration classes : 
		   Period : It deals with date based amount of time. 
		   Duration : It deals with time based amount of time.
		 */
		 
		        LocalDate date1 = LocalDate.now();
		 
		        LocalDate date2 =
		            LocalDate.of(2022, Month.APRIL, 1);
		 
		        Period gap = Period.between(date2, date1);
		        System.out.println("gap between dates "+
		                           "is a period of "+gap.getDays()+" days...");
		        
		        System.out.println("gap between dates "+
	                    "is a period of "+gap.getMonths()+" months...");
		        
		        
		
		    // Function to check duration
		  
		 
		        LocalTime time1 = LocalTime.now();
		        System.out.println("the current time is " +
		                            time1);
		 
		        Duration fiveHours = Duration.ofHours(5);
		 
		        // adding five hours to the current
		        // time and storing it in time2
		        LocalTime time2 = time1.plus(fiveHours);
		        
		      
		 
		        System.out.println("after adding five hours " +
		                           "of duration " + time2);
		 
		        Duration durgap = Duration.between(time2, time1);
		        System.out.println("duration gap between time1" +
		                           " & time2 is " + durgap);
		        
		        System.out.println("duration gap between time1" +
                        " & time2 in hours " + durgap.toHours());   
		        
		        System.out.println("duration gap between time1" +
                                " & time2 in min " + durgap.toMinutes());
		        
		        
		
		    

	}

}
