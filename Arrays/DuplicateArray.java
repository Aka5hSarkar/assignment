//3. Write a Java program to copy an array by iterating the array. 

package array;
import java.util.Arrays;
import java.util.Scanner;
 class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int copyarr[]=new int[arr.length];
		System.out.println("Enter the 5 array elements : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			copyarr[i]=arr[i];
		}
		System.out.println("The original array : "+Arrays.toString(arr));
		System.out.println("The copied array : "+Arrays.toString(copyarr));
		
	}

}
