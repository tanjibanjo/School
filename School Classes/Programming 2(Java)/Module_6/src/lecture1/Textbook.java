//this class is derived from parent class Publication
//java

package lecture1;

public class Textbook extends Publication{
	//instance variables
	private String version, subjectDomain;

	//constructors
	public Textbook(String title, String author, int number, String version, String subjectDomain) {
		super(title, author, number);
		this.version = version;
		this.subjectDomain = subjectDomain;
	}
	
	//getters and setters

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSubjectDomain() {
		return subjectDomain;
	}

	public void setSubjectDomain(String subjectDomain) {
		this.subjectDomain = subjectDomain;
	}
	
	//methods
	public String printInformation() {
		return super.printInformation() +
				"Subject Domain: " +
				this.getSubjectDomain() + "\nVersion: "
				+ this.getVersion() + "\n";
	}

}
