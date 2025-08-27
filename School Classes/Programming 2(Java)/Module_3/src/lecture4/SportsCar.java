//class that holds fields for a sports car
//java

package lecture4;

import java.util.Objects;

//enums
enum CarType {PORSCHE, FERRARI, JAGUAR }
enum CarColor {RED, BLACK, BLUE, SILVER }

public class SportsCar {
	//instance variables
	private CarType make;
	private CarColor color;
	private double price;
	
	//constructors
	public SportsCar(CarType make, CarColor color, double price) {
		this.make = make;
		this.color = color;
		this.price = price;
	}

	public CarType getMake() {
		return make;
	}

	public CarColor getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		String str = String.format("Make: %s\n"
									+ "Color: %s\n"
									+ "Price: $%,.2f",
									make, color, price);
		return str;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, make, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //if object exists in memory
			return true;
		if (obj == null) //if there are no values assigned
			return false;
		if (getClass() != obj.getClass()) //if this is not of the same class
			return false;
		SportsCar other = (SportsCar) obj; //initialize
		return color == other.color && make == other.make
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}
