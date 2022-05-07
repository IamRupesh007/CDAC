package study.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {
	public static void main(String[] args) {
		Date today = new Date();//gives Day,date,time, timezone
		System.out.println(today);
		//***************************************
		GregorianCalendar today2 = new GregorianCalendar();
		System.out.println(today2);//gives detailed date info
		//*******************************************
		
		int day = today2.get(Calendar.DAY_OF_MONTH);
		int month = today2.get(Calendar.MONTH)+1;
		int year = today2.get(Calendar.YEAR);
		
		System.out.println(day+ "-"+month+ "-" +year);
		
		//************** Days Between today and June 1
		GregorianCalendar otherday = new GregorianCalendar(2022,6-1,30);
		
		long todaymillis = today2.getTimeInMillis();
		long othermillis = today2.getTimeInMillis();
		long difference = othermillis- todaymillis;
		
		long days = (((difference/(1000))/60)/60)/24;
		
		System.out.println("Days = "+days);
		
		int weekday = otherday.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("Week of the day of 30 June 2022 ="+weekday);
		
		
	}
}
