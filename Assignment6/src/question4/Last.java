package question4;

import java.util.LinkedList;

public class Last {
public static void main(String[] args) {
	LinkedList<String> dates=new LinkedList<String>();
	dates.add("20-02-1999");
	dates.add("23-12-2000");
	dates.add("23-12-2001");
	dates.add("22-12-2002");
	System.out.println("Dates are:"+dates);
	//get my birthday
	String str=dates.get(0);
	System.out.println("My birthday is:"+str);
	System.out.println(".....................");
	boolean is_leap_year=false;
	if(2000%4==0) {
		is_leap_year=true;
		System.out.println("it was a leap year");
	}
	else {
		is_leap_year=false;
		System.out.println("it was not a leap year");
	}
		
	if(!is_leap_year) {
		str=dates.get(2);
		System.out.println("your dob is:"+str);
	}else {
		str=dates.get(1);
		System.out.println("your dob is:"+str);
	}
	System.out.println(".....................");
	
	
}
}
