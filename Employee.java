/*Scenario: In a company there are employees with two designations Manager and Trainee. Both
employees share the same set of attributes and basic salary calculation logic is same but the basic
salary of trainee and manager are different.
The Manager has a travel allowance equal to 15% of the basic salary, whereas all the other
employees the travel allowance is 10% of the basic salary. Write a program to maintain the entities
using inheritance.*/


package Lab8September;
//
//Problem Statement 1-1
public class Employee {

//taking instance variables;	
long employeId;
String employeeName;
String employeeAddress;
long employeePhone;
double basicSalary;
static double specialAllowance=250.80;
static double Hra=1000.50;
//Problem statement 1-2
Employee(){}//creating a default constructor

//creating a parameterized constructor and overloading it
Employee(long id,String name,String address,long phone,double basicSalary){
	this.employeId=id;
	this.employeeName=name;
	this.employeeAddress=address;
	this.employeId=phone;
}
//Problem statement 1-3
//method for salary calculation
 double calculateSalary() {
	double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	return salary;
}
//Problem Statement 2-1 :
 //method for transport allowance
 double calculateTransportAllowance(){
	 double transportAllowance=(10*basicSalary)/100;
	return transportAllowance;
 }


}
//Problem statement 1-4

//creating manager subclass
class Manager extends Employee{
	//creating manager constructor and overloading 
	Manager(long id,String Name,String address,long phone,double salary){
		this.employeId=id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.basicSalary=salary;
	}
	//problem statement 2-2
	//overriding the calculateTransportAllowance method in manager class
 double calculateTransportAllowance() {
		double transportAllowance=(15*basicSalary)/100;
		 return transportAllowance;
	}
}
//Problem Statement 1-4
//creating the Trainee subclass 
class Trainee extends Employee{
	//creating an overloaded constructor in this class
	Trainee(long id,String Name,String address,long phone,double salary){
		this.employeId=id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.basicSalary=salary;
	}
}
//Problem statement 1-5
class InheritanceActivity{
	public static void main(String[] args) {
	//Test Case 1 :
		//creating object of Manager class 
		Manager mng=new Manager(126534,"Peter","Chennai India",237844,65000);
		//invoking the calculateSalary method and printing the result
	    System.out.println("Manager's total salary is : "+mng.calculateSalary());
	//Test Case 2 :
	    //creating object of Trainee class
		Trainee trn=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		//invoking the calculateSalary method and printing the result
		System.out.println("Trainee's total salary is : "+trn.calculateSalary());
		
//problem statement 2-4
		//invoking the calculateTransportAllowance method and printing the result
		System.out.println("the transport allowance for manager is : "+mng.calculateTransportAllowance());
		System.out.println("the transport allowance for trainee is : "+trn.calculateTransportAllowance());
		
	}}



