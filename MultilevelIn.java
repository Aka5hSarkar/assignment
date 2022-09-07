package JavaClass;
class Vehicle1 {
	 void run() {//parent class 1
		 System.out.println("run");
	 }}
	class Car extends Vehicle1 {//child class 2 extends parent class
		void running() {
			System.out.println("go");
	}}
	class bike extends Car {//child class 3 extends the child class 2
		void speed() {
			System.out.println("speed is high");
		}}
public class MultilevelIn {

	public static void main(String[] args) {
		bike b=new bike();//creating object of the last child class which inherited previous two classes
		//calling the methods 
		b.run();
		b.running();
		b.speed();

	}

}
