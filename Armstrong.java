package JavaClass;

public class Armstrong {

	public static void main(String[] args) {
    int originalnum=153;
    int num=originalnum;
    int result=0;
    while(num!=0) {
    	int remainder=num%10;
    	result+=Math.pow(remainder, 3);
    	num/=10;
    }if (result==originalnum) {
    	System.out.println(originalnum + " is a armstrong number");
    }else {
    	System.out.println(originalnum + " is not a armstrong number");
    }
	}

}
