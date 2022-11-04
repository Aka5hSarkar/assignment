package threadAssignment;

public class NewThreadClass implements Runnable {
	@Override
	public void run() {
		System.out.println("Something");
	}

	public static void main(String[] args) {
		NewThreadClass th=new NewThreadClass();
		Thread t1=new Thread(th);
		Thread t2=new Thread(th);
		Thread t3=new Thread(th);
		Thread t4=new Thread(th);
		Thread t5=new Thread(th);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
