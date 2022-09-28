/*
 3. Write a Java Program to reverse the array contents.
*/

package array;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length : ");
		int n=sc.nextInt();//taking array length as input
		int arr[]=new int[n];//creating a new array with n length/size
		System.out.println("enter the array elements : ");
		//taking the array elements as input using the for loop
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr);/*reversing the array elements by 
					   calling the reverse method*/
	}
	/*creating a static method to reverse an array
	where the old array is passed as the parameter of the method*/
	static void reverse(int a[]) {
		/*creating a new array of same size as the old array
		  where the elements of the old array
		  will be stored in a reversed order*/
		int newarr[]=new int[a.length];
		/*storing old array elements in the new array in a 
		reverse order using for loop*/
		for (int i=0;i<a.length;i++) {
			newarr[a.length-1-i]=a[i];	
		}
		//traversing through the new reversed array and printing it
		for (int i=0;i<a.length;i++) {
			System.out.print(newarr[i]+" ");
		}
	}
}
