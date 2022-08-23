//Q.2 WAJP to solve quadratic equatioN

package Assignments;
import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input a = ");
		double a=sc.nextFloat();
		System.out.println("input b = ");
		double b=sc.nextFloat();
		System.out.println("input c = ");
		double c=sc.nextFloat();
		double root1,root2;
		double result=b*b-4*a*c;
		
		if (result>0) {
			root1=(-b + Math.sqrt(result))/(2*a);
			root2=(-b - Math.sqrt(result))/(2*a);
			System.out.println("root1= "+root1+" root2= "+root2);
		}else if (result==0) {
			root1=root2=-b/(2*a);
			System.out.println("root1=root2= "+root1);
		}else {
			System.out.println("the equation has no real roots.");
		}
		
		

	}

}
