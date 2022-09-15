package question1;

public class Dividebyzero {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=9;
	int b=0;
	try {
		System.out.println(a/b);
	}
	catch(ArithmeticException e) {
	System.out.println("divided by zero cannot be possible");
		}
}
}