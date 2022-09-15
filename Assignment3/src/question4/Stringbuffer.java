package question4;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1=new StringBuffer("StringBuffer");

s1.append(" is a peer class of string");
s1.append(" that provides much of");
s1.append(" the functionality of strings.");
System.out.println(s1);
StringBuffer s3=new StringBuffer("it is used to  at the specified index position.");
s3.insert(14, "insert text");
System.out.println(s3);
System.out.println(s3.reverse());
	}

}
