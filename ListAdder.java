package threadAssignment;
////3.Create a thread to add 10 string in a arraylist and now write another thread to 
//print the same but ensure both must work independently
import java.util.*;
class ThreadAdd extends Thread{
	ArrayList<String> str=new ArrayList<String>();
	ThreadAdd(ArrayList<String> str){
		this.str=str;
	}
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Strings : ");
		for (int i=0;i<10;i++) {
			str.add(sc.next());
		}
	}
}
class ThreadShow extends Thread{
	ThreadAdd thadd;
	 ThreadShow(ThreadAdd thadd) {
		this.thadd=thadd;
	}
	@Override
	public void run() {
		System.out.println("Array List : "+thadd.str);
	}
}
public class ListAdder {

	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<String>();
		ThreadAdd t1=new ThreadAdd(s);
		ThreadShow t2=new ThreadShow(t1);
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
