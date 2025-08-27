//************************************************************************
// Author: Lane Pollock
// Date: 14 Nov 2024
// Language: Java
// Assignment: CLO - Shape Class
// Description: Driver to demonstrate the abstract and derived classes
//  of shapes
//************************************************************************


package clo;

import java.util.ArrayList;

public class ShapeMain {

	public static void main(String[] args) {
		//local variables
		Shape myCircle = new Circle("Green", 2);
		Shape myRectangle = new Rectangle("Red", 6, 5);
		Shape myTraingle = new Triangle("Blue", 6, 5, 5);
		
		//arraylist of shapes
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		//add objects into generic shape list
		shapes.add(myCircle);
		shapes.add(myRectangle);
		shapes.add(myTraingle);
		
		//now loop through list to show methods and properties
		for(Shape shape : shapes) {
			shape.printShapeInfo();
			System.out.println("Perimeter: " + shape.perimeter());
			System.out.println("Area: " + shape.area());
			System.out.println();
		}

	}

}
