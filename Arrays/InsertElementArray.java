/*4. Write a Java program to insert an element (specific position)
   into an array. */

package array;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElementArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int newarr[]=new int[arr.length+1];
		System.out.println("Enter the 5 array elements : ");
		
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array : "+Arrays.toString(arr));
		System.out.println("At which index you want to insert the element : ");
		int index=sc.nextInt();
		System.out.println("What number you want to insert? ");
		int insert=sc.nextInt();
		for (int i=0;i<newarr.length;i++) {
			if (i<index) {
				newarr[i]=arr[i];
			}else if(i==index) {
				newarr[i]=insert;
			}else {
				newarr[i]=arr[i-1];
			}
		}
		System.out.println("After inserting the new array is : "+Arrays.toString(newarr));

	}

}
