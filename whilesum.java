package Assignments;
import java.util.*;
public class whilesum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("enter first number : ");
			float a=sc.nextFloat();
			System.out.println("enter second number : ");
			float b=sc.nextFloat();
			System.out.println("the sum is : "+(a+b));
			System.out.println("if you want to continue enter 0 otherwise enter 1");
			 choice=sc.nextInt();
		}while (choice==0);	
	}
}
