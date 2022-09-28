/*2. Write a Java program to remove a specific element 
   from an array. */

package array;
import java.util.Arrays;
//2
import java.util.Scanner;

public class RemoveArrayElement {

	public static void main(String[] args) {
		//creating an array of 5 elements
		int arr[]=new int[5];
		/*creating another array of 1 less element than the previous one
		because after removing one element the array length will be 
		reduced by 1*/
		int arr2[]=new int[arr.length-1];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 array elements : ");
		//taking the array elements as input using for loop
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//printing the 1st array using toString method of Arrays class
		System.out.println("The original array : "+Arrays.toString(arr));
		System.out.println("\nWhich element you want to remove? ");
		int r=sc.nextInt();//taking input of the element user want to remove
		for (int i=0,j=0;i<arr.length;i++) {//traversing through the array
			if(arr[i]!=r) {
				arr2[j]=arr[i];/*storing the elements in the new array except
								the one user want to remove*/
				j++;
			}
		}//printing the new array using toString method
		System.out.println("Array after removing the element : "+Arrays.toString(arr2));	
}}
