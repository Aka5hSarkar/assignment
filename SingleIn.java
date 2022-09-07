package JavaClass;
//single inheritance
class mercedes{//parent class
	void run() {
		System.out.println("it is car");
	}
}

class cycle extends mercedes {//child class extends parent class
void running() {
	System.out.println("it is cycle");
}
}

public class SingleIn {

	public static void main(String[] args) {
		//creating object of the child class
		cycle b=new cycle();
		//calling methods
		b.run();
		b.running();
	}
}
