//Lane Pollock
//5 Sep 2024
//demo on random class
//java

package lecture4;

//random class
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// local var
		Random random = new Random(); //create new object
		
		//generate random int
		//full range (-2^31) - (2^31 -1)
		int randomInt1 = random.nextInt();
		//0-100 exclusive
		int randomInt2 = random.nextInt(100);
		//11 represents the range (5 - 15) + 1
		int randomInt3 = random.nextInt(11) + 5;
		
		//random doubles
		//0-1
		double randomDbl1 = random.nextDouble();
		//0-100
		double randomDbl2 = random.nextDouble() * 100;
		
		//random booleans
		boolean randomBool = random.nextBoolean();
		
		//random long
		long randomLong = random.nextLong();
		
		//print
		System.out.println("Randomg int1: " + randomInt1);
		System.out.println("Random int2: " + randomInt2);
		System.out.println("Random int3: " + randomInt3);
		System.out.println("Random dbl1: " + randomDbl1);
		System.out.println("Random dbl2: " + randomDbl2);
		System.out.println("Random boolean: " + randomBool);
		System.out.println("Random long: " + randomLong);

	}

}
