//implements employee - LEAF

package lecture2;

public class Developer implements Employee{
	//instance variables
	private String name;
	private long   empID;
	private String position;
	
	//constructor
	public Developer(long empID, String name, String position) {
		this.empID = empID;
		this.name = name;
		this.position = position;
	}
	
	@Override
	public void showEmployeeDetails() {
		System.out.println(empID + " " + name + " " + position);
	}
	

}
