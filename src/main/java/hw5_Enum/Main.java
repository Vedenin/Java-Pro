package hw5_Enum;
/*
1. Создайте перечисление Weekday дней недели - MONDAY, …, SUNDAY. Напишите в этом перечислении функции isWeekDay():true
 - является ли день рабочим и функцию isWeekEnd(): true - является ли день выходным.

2. Create an Emun Cru. BASE(80), PREMIER(90), GRAND(100). Add a field quality:int and add a construction.
 */
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Weekdays.isWeekDay()));
		System.out.println(Arrays.toString(Weekdays.isWeekEnd()));
		
		System.out.println(Cru.BASE.getQuality());
		System.out.println(Cru.PREMIER.getQuality());
		System.out.println(Cru.GRAND.getQuality());
	}
}
