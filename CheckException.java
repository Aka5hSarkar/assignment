/*You will be given two integers x and y as input,you have to compute x/y
 * If x and y are not 32 bit signed integers or if y is zero,exception will
 * occur and you have to report it.
 */

package exception;
import java.util.Scanner;//importing scanner class

public class CheckException {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//object of scanner class
		//try block 
		try {
		System.out.println("enter x : ");
		int x=sc.nextInt();//taking input.InputMissmatchException might occur
		System.out.println("enter y : ");
		int y=sc.nextInt();//taking input.InputMissmatchException might occur
		System.out.println(x/y);//ArithmeticException might occur
		//catch block for reporting the exception
		}catch(Exception e) {
			System.out.println(e);
		}
}}
