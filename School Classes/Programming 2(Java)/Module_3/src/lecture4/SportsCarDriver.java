package lecture4;

public class SportsCarDriver {

	public static void main(String[] args) {
		//local variables
		SportsCar newCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 100000);
		
		//switch on car make
		switch(newCar.getMake() )
		{
		case PORSCHE:
			System.out.println("Your car was made in Germany.");
			break;
		case FERRARI:
			System.out.println("Your car was made in Italy.");
			break;
		case JAGUAR:
			System.out.println("Your car was made in England.");
		default:
			System.out.println("I'm not sure where this car was made");
		}
	}

}
