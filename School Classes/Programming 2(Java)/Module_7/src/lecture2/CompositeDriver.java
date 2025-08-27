package lecture2;

public class CompositeDriver {

	public static void main(String[] args) {
		//local variables
		Employee dev1 = new Developer(100, "Fred Flinstone", "Pro Developer");
		Employee dev2 = new Developer(101, "Bart Simpson", "Developer");
		
		CompanyDirectory empDirectory = new CompanyDirectory();
		
		empDirectory.addEmployee(dev1);
		empDirectory.addEmployee(dev2);
		
		empDirectory.showEmployeeDetails();

	}

}
