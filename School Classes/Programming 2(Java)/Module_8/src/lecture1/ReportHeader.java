//program to demonstrate the singleton design pattern
//provides a single report header for company
//java

package lecture1;

public class ReportHeader {
	//instance variables
	private static volatile ReportHeader instance;
	private String header;
	
	//PRIVATE constructor
	private ReportHeader() {
		//initialize header
		this.header = "ABC Programming Company\nSan Antonio " +
					"Office\n210-837-1234\n\n";
	}
	
	//method to get the instance
	//static, so it can be accessed without an instance of class
	public static ReportHeader getInstance() {
		//if instance is null, it has not been initialized
		if(instance == null){
			synchronized (ReportHeader.class) {
				if(instance == null) {
					instance = new ReportHeader();
				} //end inner if
			} //end synch
		} //end outer if
		return instance;
	}
	
	//method to get header
	public String getHeader() {
		return this.header;
	}
	
	//new print method
	public void printHeader() {
		System.out.println(this.header);
	}

}
