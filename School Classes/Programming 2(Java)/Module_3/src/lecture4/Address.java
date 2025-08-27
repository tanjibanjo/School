//Lane Pollock
//1 Oct 2024
//Demo
//Address class that represents address with a street, city, state, and zip

package lecture4;

public class Address {
	//instance variables
	private String streetAddress;
	private String city;
	private String state;
	private String zip; //zip code is string bc if it starts with a 0, int will remove leading zeroes
	
	/* constructors */
	
	//default
	public Address() {
		this.streetAddress = "Unknown Street Address";
		this.city = "Unknown City";
		this.state = "Unknown State";
		this.zip = "Unknown Zip";
	}
	
	//parameterized
	public Address(String address, String city, String state, String zip) {
		this.streetAddress = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	//copy constructor
	public Address(Address addr) {
		this.streetAddress = addr.streetAddress;
		this.city = addr.city;
		this.state = addr.state;
		this.zip = addr.zip;
	}
	
	/* setters and getters */

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}
	
	/* methods */
	
	//override the toString() method
	@Override
	public String toString() {
		return "\n\t" + streetAddress + "\n" + "\t" + city + ", " + state + ", " + zip + "\n";
	}
	

}
