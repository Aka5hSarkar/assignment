//7. Write a Java program to find the duplicate values of an array

package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		int arr[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 array elements : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("your array : "+Arrays.toString(arr));
		Arrays.sort(arr);//sorting the array elements in a ascending order
		System.out.println("The duplicate elements are : ");
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {//finding duplicate element
					System.out.print(arr[i]+" ");
				}
			}
		}

	}

}
