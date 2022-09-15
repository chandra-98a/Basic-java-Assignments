package question5;


import java.util.Scanner;
public class Incometax {
	public static void main(String[] args)
	{
		double tax=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the CTC");
        double ctc =sc.nextDouble();
        if(ctc<180000) {
        	System.out.println("Tax is nil");
        }else if(ctc>=181001 && ctc<300000) {
        	tax=0.1*ctc;
        	System.out.println("tax="+tax);
        }else if(ctc>=300000&&ctc<500000) {
        	tax=0.2*ctc;
        	System.out.println("tax="+tax);
        }else
        {
        	tax=0.3*ctc;
        	System.out.println("tax="+tax);
        }
	}

}
