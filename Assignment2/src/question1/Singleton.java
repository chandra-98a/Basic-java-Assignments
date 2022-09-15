package question1;

import question1.Singleton;

public class Singleton {

String name;
private static Singleton s;
private Singleton() {
	name="hello";
}
static Singleton getInstance() {
	if(s==null)
		s=new Singleton();
	return s;
}
protected static void demo() {
	System.out.println("demo");
}
}