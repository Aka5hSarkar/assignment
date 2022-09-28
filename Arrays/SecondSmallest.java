/*6. Write a Java program to find the second smallest element 
   in an array.*/

package array;
import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the array elements : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		Arrays.sort(arr);//sorting the array elements in a ascending order
		System.out.println("Second smallest number is : "+arr[1]);

	}

}
