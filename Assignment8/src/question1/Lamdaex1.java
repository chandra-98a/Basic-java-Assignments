package question1;

@FunctionalInterface
interface Arithmetic{
	int operations(int a,int b);
}

public class Lamdaex1 {

	public static void main(String[] args) {
		Arithmetic addition=new Arithmetic() {
			
			public int operations(int a,int b) {
				return (a+b);
			}
		};
Arithmetic subtraction=new Arithmetic() {
			
			public int operations(int a,int b) {
				return (a-b);
			}
		};
Arithmetic multiplication=new Arithmetic() {
			
			public int operations(int a,int b) {
				return (a*b);
			}
		};
Arithmetic division=new Arithmetic() {
			
			public int operations(int a,int b) {
				return (a/b);
			}
		};
		System.out.println("Addithion =>"+ addition.operations(10,20));
		System.out.println("Subtraction =>"+ subtraction.operations(10,20));
		System.out.println("Multiplication =>"+ multiplication.operations(10,20));
		System.out.println("Division =>"+ division.operations(10,20));
	}
}
