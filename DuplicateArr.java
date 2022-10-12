package array;
import java.util.*;
public class DuplicateArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string : ");
		String s=sc.nextLine();
		char[] arr=new char[s.length()];
		for (int i=0;i<arr.length;i++) {
			arr[i]=s.charAt(i);
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("dupicate element is : "+arr[i]);
				}
			}
		}
	}

}
