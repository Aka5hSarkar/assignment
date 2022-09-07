//Problem Statement 1
package com.innovtion.shapes;

import java.util.Scanner;

public class Circle {
private float radius;//declaring instance variable radius
static float pi=3.5f;
//default constructor 1
Circle(){
	radius=1.5f;
}
//cons2
Circle(float radius){
	this.radius=radius;
}
//cons3
Circle(float radius,float pi){
	//cons chaining using cons2
	this.radius=radius;
}
//method1
static float calculateCircleArea(float radius ) {
	return pi*radius*radius;
}
//method2
static float calculateCircumference(float radius) {
	return 2*pi*radius;
}

	public static void main(String[] args) {
		Circle obj=new Circle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		float radius=sc.nextFloat();
		System.out.println("the area is : "+calculateCircleArea(radius));
		System.out.println("the circumference is : "+calculateCircumference(radius));

		
	}
}

