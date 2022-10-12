package Assignments;

public class NewPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for (int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for (int k=2;k<=i;k++) {
				System.out.print(k+" ");
			}System.out.println();
		}
			
	}
}
