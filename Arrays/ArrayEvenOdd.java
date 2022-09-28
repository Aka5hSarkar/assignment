//8. Write a Java program to find the number of even and odd integers 
package array;
import java.util.Scanner;
public class ArrayEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the 5 array elements : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Even numbers are : ");
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\n Odd numbers are : ");
		for (int i=0;i<arr.length;i++) {
			if (arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
