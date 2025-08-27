package Lecture3;

import java.util.ArrayList;

public class TypeConversions {
	public static void main(String [] args) {
		//declare local variables
		int intNum1 = 5;
		int intNum2 = 12;
		int intNum3 = 10;
		float fltResult = 0.00f;
		double dblResult = 0.0;
		
		//output the float result
		fltResult = intNum1 / intNum2;
		System.out.println("Result of my float math is: " + fltResult);
		
		//now retry using type cast to get desired results
		fltResult = (float)intNum1 / intNum2;
		System.out.printf("Result of my float math after conversion is: %.2f\n" , fltResult); //flags work with printf!!!
		
		//implicit conversion from int to double
		System.out.println("My integer variable: " + intNum3);
		
		dblResult = intNum3; //computer will automatically convert
		System.out.println("My double result: "+ dblResult);
		
		//wrapper class examples
		//local variables
		Integer integerObject = 10;
		
		//unboxing - turns object into primitive
		int integerPrimitive = integerObject;
		System.out.println(integerPrimitive);	
		//utility method
		int parsedInt = Integer.parseInt("100");
		System.out.println(parsedInt);
		//null handling 
		integerObject = null;
		
		//using collections 
		ArrayList<Double> doubles = new ArrayList<Double>();
		doubles.add(10.5);
		
		int primitiveInt = 42;
		Integer wrappedInt = Integer.valueOf(primitiveInt); //turns primitive into object
		System.out.println("Wrapped integer: " + wrappedInt);
		
		//unwrapping 
		int unwrappedInt = wrappedInt.intValue();
		System.out.println("Unwrapped int: " + unwrappedInt);
		
		//autoboxing
		Integer autoboxedInt = primitiveInt;
		System.out.println("Autoboxed int: " + autoboxedInt);
		
		//unbox auto
		int unboxedInt = autoboxedInt;
		System.out.println("Auto-unboxed int: "+ unboxedInt);
		
		//parse method
		int parsedInt2 = Integer.parseInt("123");
		System.out.println(parsedInt2);
		
		//max value
		int maxInt = Integer.MAX_VALUE;
		System.out.println("Max Value: " + maxInt);
		
	}
}
