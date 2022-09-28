//1. Write a Java program to find the index of an array element. 

package array;
import java.util.Arrays;
import java.util.Scanner;
public class FindIndex {

	public static void main(String[] args) {
		//creating an array of 5 elements
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 array elements : ");
		//taking the elements as input using for loop
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//printing the array using toString method of Arrays class
		System.out.println("Your array : "+Arrays.toString(arr));
		System.out.println("Of which element you want index? ");
		int e=sc.nextInt();//the element which index we have to find
		for (int i=0;i<arr.length;i++) {//traversing through the array
			if(arr[i]==e) {//finding the index number of the element
				System.out.println("The index of this element : "+i);
			}
		}
	}

}
