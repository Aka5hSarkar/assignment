
//4

package threadAssignment;
class Sync{
	synchronized String print(String str) {
		return str;
	}
}
class Thread1 extends Thread{
	Sync sn;
	public Thread1(Sync sn) {
		this.sn=sn;
	}
	@Override
	public void run() {
		System.out.print(sn.print("I"));
	}
	
}
class Thread2 extends Thread{
	Sync sn;
	public Thread2(Sync sn) {
		this.sn=sn;
	}
	@Override
	public void run() {
		System.out.print(sn.print("want"));
	}
	
}
class Thread3 extends Thread{
	Sync sn;
	public Thread3(Sync sn) {
		this.sn=sn;
	}
	@Override
	public void run() {
		System.out.print(sn.print("to"));
	}
	
}
class Thread4 extends Thread{
	Sync sn;
	public Thread4(Sync sn) {
		this.sn=sn;
	}
	@Override
	public void run() {
		System.out.print(sn.print("learn"));
	}
	
}
class Thread5 extends Thread{
	Sync sn;
	public Thread5(Sync sn) {
		this.sn=sn;
	}
	@Override
	public void run() {
		System.out.print(sn.print("JAVA"));
	}
	
}

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Sync sn=new Sync();
		Thread1 t1=new Thread1(sn);
		Thread2 t2=new Thread2(sn);
		Thread3 t3=new Thread3(sn);
		Thread4 t4=new Thread4(sn);
		Thread5 t5=new Thread5(sn);
		t1.start();t1.join();
		t2.start();t2.join();
		t3.start();t3.join();
		t4.start();t4.join();
		t5.start();
	}

}
