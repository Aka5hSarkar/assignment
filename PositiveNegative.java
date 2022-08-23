//Q.1 WAJP to get a number from the user and print whether it is positive or negative.

package Assignments;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input number : ");
		float a=sc.nextFloat();
		if (a>0) {
			System.out.println("the number is positive");
		}else if (a==0) {
			System.out.println(a);
		}else {
			System.out.println("the number is negative");
		}

	}

}
