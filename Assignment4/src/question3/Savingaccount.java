package question3;
import java.util.Scanner;
import java.util.*;
public class Savingaccount {
	static void fun() throws InsufficientBalanceException
	{
		double balance =0, damount, wamount;
		Scanner dep=new Scanner (System.in);
		System.out.println("Deposit an amount");
		damount=dep.nextInt();
	        balance += damount;

	        Scanner wd=new Scanner(System.in);
	        System.out.println("Withdraw an amount");
	        wamount=wd.nextInt();
	        balance-=wamount;
	        

		if(balance<0)
		{
			throw new InsufficientBalanceException(); 
			}
        else
        System.out.println("balance="+balance);
    }

    public static void main(String args[]) 
    { 

        try
        { 
            fun(); 
        } 
        catch(InsufficientBalanceException ex) 
        { 
            System.out.println("Exceeding Balance"); 
        } 
    } 
    
}
		
