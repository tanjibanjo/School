//************************************************************************
// Author: Lane Pollock
// Date: 30 Oct 2024
// Language: Java
// Assignment: Lab 5.1 - Baseball Team
// Description: Driver class to create instances of Player and Coach and
//	call their toString() methods
//************************************************************************


package lab1;

public class TeamDriver {

	public static void main(String[] args) {
		//instances
		Player myPlayer = new Player("Henry Baez", 10, "Pitcher");
		Coach myCoach = new Coach("Luke Montez", 30, "Manager");
		
		//call the toString methods
		System.out.println(myPlayer);
		System.out.println(myCoach);

	}

}
