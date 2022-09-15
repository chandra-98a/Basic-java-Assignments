package question3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplierdemo{


	 	public static void main(String[] args) {
	 	// TODO Auto-generated method stub
	 		//Supplier<String> supplier=()-> "hi hello";
	 		//System.out.println(supplier.get());
	 		List<String> list1=Arrays.asList();
			System.out.println(list1.stream().findAny().orElseGet(()->"hi hello"));
		}
	    
}


