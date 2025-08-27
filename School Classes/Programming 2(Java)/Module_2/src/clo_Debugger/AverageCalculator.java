//************************************************************************
// Author: Lane Pollock
// Date: 13 Sep 2024
// Language: Java
// Assignment: CLO 2 - Debugger Assignment
// Description: Follow directions to use debugger and fix errors in code
//************************************************************************


package clo_Debugger;

public class AverageCalculator {

	public static void main(String[] args) {
		int[] numbers = {2, 4, 6, 8, 10};
        double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }
    private static double calculateAverage(int[] nums) {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum / nums.length;
    }
}