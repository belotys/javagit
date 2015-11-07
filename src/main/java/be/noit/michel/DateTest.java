package be.noit.michel;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateTest {

	public static void main(String[] args) {
		
		DayOfWeek dw = DayOfWeek.MONDAY;
		
		System.out.println(dw.getDisplayName(TextStyle.FULL, Locale.FRANCE));
		System.out.println(dw.getDisplayName(TextStyle.NARROW, Locale.FRANCE));
		System.out.println(dw.getDisplayName(TextStyle.SHORT, Locale.FRANCE));
		
		System.out.println(dw.minus(3).getDisplayName(TextStyle.FULL, Locale.FRANCE));
		
		
		
		
	}
}
