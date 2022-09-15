package question3;


import java.util.Scanner;
public class Compoundinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter principal");
double principal=scan.nextDouble();
System.out.println("enter time");
double time=scan.nextDouble();
System.out.println("enter rate");
double rate=scan.nextDouble();

System.out.println("enter number to be compounded");
double number=scan.nextDouble();
double compoundinterest=principal*(Math.pow((1+rate/100),(time*number)))-principal;
System.out.println("compoundinterest :"+ compoundinterest);
	}

}
