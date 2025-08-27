//Lane Pollock
// 5 Sep 2024
//Demo of MathClass in Java

package lecture4;

public class MathClassDemo {
	public static void main(String[] args) {
		//local variables
		int int1 = -5;
		
		double dbl1 = 25.0;
		
		double dbl3 = 4.2;
		double dbl4 = 4.8;
		
		
		//abs()
		int abs = Math.abs(int1);
		System.out.println("The absolute value of number 1 is: " + abs);
		
		//sqrt()
		double sqrt = Math.sqrt(dbl1);
		System.out.println("The square root of " + dbl1 + " is: " + sqrt);
		
		//ceil()
		double ceil = Math.ceil(dbl3);
		System.out.println("The ceil function on 4.2: " + ceil);
		
		//floor()
		double floor = Math.floor(dbl4);
		System.out.println("The floor method on 4.8: " + floor);
		
		//random
		double random = Math.random();
		System.out.println("Math.random(); makes a random number between 0.0 and 1.0: " + random);
		//this is different than the random class!!
	}

}
