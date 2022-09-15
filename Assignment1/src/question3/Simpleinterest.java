package question3;


import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principle");
double principle=scan.nextDouble();
System.out.println("enter time");
double time=scan.nextDouble();
System.out.println("enter rate");
double rate=scan.nextDouble();
double simpleinterest;
simpleinterest=(principle*time*rate)/100;
System.out.println("Simple interest:" + simpleinterest );
	}

}
