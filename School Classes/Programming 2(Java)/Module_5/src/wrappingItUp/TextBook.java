//textbook class derived from publication

package wrappingItUp;

import java.util.Objects;

public class TextBook extends Publication{
	//instance variables
	private String version, subjectDomain;

	//getters/setters
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
	
	//constructors

	public TextBook(String title, Author author, int numberOfPages, String ISBN, String version, String subjectDomain) {
		super(title, ISBN, numberOfPages, new Author(author));
		this.version = version;
		this.subjectDomain = subjectDomain;
	}
	public TextBook() {
		super();
		this.version = "No Version";
		this.subjectDomain = "No Subject";
	}
	public TextBook(TextBook b) {
		super(b.getTitle(), b.ISBN, b.numberOfPages, new Author(b.getPubAuthor()) );
		this.version = b.version;
		this.subjectDomain = b.subjectDomain;
	}
	
	//overrides
	@Override 
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Version: " + this.version);
		sb.append("Subject Domain: " + this.subjectDomain + "\n");
		
		return sb.toString();
	}
	
	@Override 
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		TextBook tb = (TextBook)o;
		return Objects.equals(version, tb.version) &&
				Objects.equals(subjectDomain, tb.subjectDomain);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), version, subjectDomain);
	}

}
