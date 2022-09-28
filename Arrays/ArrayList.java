/*2. Write a Java program to create a new array list of elements,
 add some colors (string) and print out the collection.*/

package array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many colors you want ?");
		//taking length/size of the array as input
		int num=sc.nextInt();
		//creating a new array of num length/size
		String arr[]=new String[num];
		System.out.println("enter the colors : ");
		//taking the array elements as input using the for loop
		for (int i=0;i<num;i++) {
			arr[i]=sc.next();
		}
		//traversing through the array and printing it's elements
		for (int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
		//using toString method to  print the array
		System.out.println(Arrays.toString(arr));
	}

}
