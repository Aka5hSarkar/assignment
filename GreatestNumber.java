//Q.3 Take three numbers from the user and print the greatest number.

package Assignments;
import java.util.Scanner;
public class GreatestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input 1st number : ");
		float a=sc.nextFloat();
		System.out.println("input 2nd number : ");
		float b=sc.nextFloat();
		System.out.println("input 3rd number : ");
		float c=sc.nextFloat();
		if (a>b && a>c) {
			System.out.println(a + " is greatest");
		}else if (b>a && b>c) {
			System.out.println(b + " is greatest");
		}else {
			System.out.println(c + " is greatest");
		}
	}

}
