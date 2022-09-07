package com.innovtion.shapes;
import java.util.Scanner;

public class Area {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the radius");
	 float radius=sc.nextFloat();
	 Circle circle=new Circle(radius);
 }
}
