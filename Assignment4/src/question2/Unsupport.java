package question2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unsupport {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=9;
int b=0;
String array[]= {"a","b"};
List<String> list=Arrays.asList(array);
List<String> arraylist= new ArrayList<>(list);
arraylist.add("d");
System.out.println(arraylist);


try {
	System.out.println(a/b);
}
catch(ArithmeticException e) {
System.out.println("divided by zero cannot be possible");
	}

}
}