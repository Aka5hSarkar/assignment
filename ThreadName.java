package threadAssignment;
//1. Write a thread to print the thread name with a 2 sec delay with main thread.
import java.util.Date;//importing Date class

public class ThreadName {
	
	public static void main(String[] args) {
		Thread t1=new Thread("New Thread");//new thread
		//getting thread name and current time
		System.out.println("Thread name : "+t1.getName()+",Time : "+new Date());
		try {
			Thread.sleep(2000);//adding 2 second delay with sleep method
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//executing main thread after 2 second
		System.out.println("This is main thread,Time : "+new Date());
	}

}
