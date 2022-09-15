package question3;

import question2.Employee;
import question2.Labour;
import question2.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account("Raghu",60000);
		System.out.println("total cash in account="+a.totalCash(20000));
		Currentaccountholder c=new Currentaccountholder("Nikhil",20000,500);
		System.out.println("total cash of currentaccountholder="+c.totalCash(255550));
		Savingaccountholder s=new Savingaccountholder("Bhim",30000,4800,98000);
		System.out.println("totalcash of savingaccountholder="+s.totalCash(67890));
	}

}
