package question5;

public class Sbuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s1=new StringBuilder("StringBuffer");

s1.append(" is a peer class of string");
s1.append(" that provides much of");
s1.append(" the functionality of strings.");
System.out.println(s1);
StringBuilder s3=new StringBuilder("it is used to  at the specified index position.");
s3.insert(14, "insert text");
System.out.println(s3);
System.out.println(s3.reverse());

}
}
