package com.cognizant.shapes;

class Rectangle {
void calculateArea() {
	System.out.println("The Area of the rectangle is calculated using formula length*breadth");
}
}
class AreaCalculator{
	public static void main(String arg[]) {
		Rectangle r=new Rectangle();
		r.calculateArea();
	}
}