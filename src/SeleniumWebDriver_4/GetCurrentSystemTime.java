package SeleniumWebDriver_4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetCurrentSystemTime {

	public static void main(String[] args) {
	
		
		DateFormat fm = new SimpleDateFormat("dd");
		Date dt = new Date();
		
	String date =	fm.format(dt);
		
		System.out.println(" date and time "  +date);
		
		
		
		

	}

}
