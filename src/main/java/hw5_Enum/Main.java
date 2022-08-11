package hw5_Enum;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Weekdays.isWeekDay()));
		System.out.println(Arrays.toString(Weekdays.isWeekEnd()));
		
		System.out.println(Cru.BASE.quality);
		System.out.println(Cru.PREMIER.quality);
		System.out.println(Cru.GRAND.quality);
	}
}
