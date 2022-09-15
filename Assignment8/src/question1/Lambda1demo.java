package question1;
@FunctionalInterface
interface Arithmetic{
	int operations(int a,int b);
}

public class Lambda1demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic addition=(a,b)->(a+b);
		System.out.println("Addithion =>"+ addition.operations(10,20));
		Arithmetic subtraction=(a,b)->(a-b);
		System.out.println("Subtraction =>"+ subtraction.operations(10,20));
		Arithmetic multiplication=(a,b)->(a*b);
		System.out.println("Multiplication =>"+ multiplication.operations(10,20));
		
		Arithmetic division=(a,b)->(a/b);
		System.out.println("Division =>"+ division.operations(10,20));
	}

}
