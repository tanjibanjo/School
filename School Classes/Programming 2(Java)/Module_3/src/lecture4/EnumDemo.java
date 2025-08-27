//Lane Pollock
//JAVA
//enum demo

package lecture4;

public class EnumDemo {
	
	//before main! declare enum
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }

	public static void main(String[] args) {
		//local variables
		Day workDay = Day.WEDNESDAY;
		
		//display WEDNESDAY
		System.out.println(workDay);
		
		//display ordinal value
		System.out.println("The ordinal value for " + workDay + " is " + workDay.ordinal() );
		
		//compare days
		if(Day.FRIDAY.compareTo(Day.MONDAY) > 0)
			System.out.println(Day.FRIDAY + " is greater than " + Day.MONDAY);
		else
			System.out.println(Day.FRIDAY + " is not greater than "  + Day.MONDAY);

	}

}
