/*1. Java Program to find average of an int Array.*/

package array;
import java.util.Scanner;
public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many numbers you want to give as input ?");
		//taking length/size of the array as input
		int num=sc.nextInt();
		//creating a new array of num length/size
		int arr[]=new int[num];
		System.out.println("enter the numbers : ");
		//taking the array elements as input using the for loop
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		/*calculating and printing average of array elements
		using the average method*/
		System.out.println("The average of "+num+" numbers are : "+average(arr));
		
	}
	/*creating a static method which takes an array as a parameter
	 and return the average of the elements present in the array*/
	static float average(int[] arr) {
		float sum=0;//creating a variable sum and initializing its value as 0
		//calculating sum of all the elements present in the array
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum/arr.length;//returning the average
	}
}
