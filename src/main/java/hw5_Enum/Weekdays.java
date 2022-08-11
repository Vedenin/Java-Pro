package hw5_Enum;

public enum Weekdays {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		
		public static Weekdays[] isWeekDay() {
			return new Weekdays[]{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};
		}
	
		public static Weekdays[] isWeekEnd() {
			return new Weekdays[] {SATURDAY, SUNDAY};
		}
}
