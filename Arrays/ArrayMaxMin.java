//5. Write a Java program to find the maximum and minimum value of an array.
   

package array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 numbers as array elements : ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array is : "+Arrays.toString(arr));
		Arrays.sort(arr);//sorting the array elements in a ascending order
		System.out.println("The maximum number : "+arr[arr.length-1]);//the maximum number will be the last element
		System.out.println("The minimum number : "+arr[0]);//the minimum number will be the first element
		
		//another way :
		
		System.out.println("\nthe maximum element is : "+max(arr));
		System.out.println("the minimum element is : "+min(arr));
		}

	static int max(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	static int min(int a[]) {
		int min=a[0];
		for (int i=0;i<a.length;i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
}
