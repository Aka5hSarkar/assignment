package threadAssignment;
//2.now write the same program using Runnable interface
import java.util.Date;

public class ThreadNameRunnbale {

	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {}
		},"Akash");
		System.out.println("Thread name : "+t1.getName()+",Time : "+new Date());
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("This is main thread after 2 sec delay, Time : "+new Date());
					
	}

}
