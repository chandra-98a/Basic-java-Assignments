package question6;


import java.util.Scanner;
public class Cui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the username");
	    String loginname=sc.next();
		System.out.println("enter the password");
		String password=sc.next();
		
		if(loginname.charAt(0)==password.charAt(0)) {
			System.out.println("welcome "+loginname);
        
		}else {    
        	System.out.println("contact admin");
        }
	}
}

