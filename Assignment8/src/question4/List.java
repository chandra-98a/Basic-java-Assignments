package question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class List {
	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		//apply removeIf()
		numbers.removeIf(n->(n%3==0));
		
		//print list with iterator
		Iterator<Integer> it= numbers.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println("iterator value:"+i);
		}
	}
}
		
	
		
		
		
	

