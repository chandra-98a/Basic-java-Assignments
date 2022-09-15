package question2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	
}
@info
public class Secondquestion {
int authorId;
String author;
String supervisor;
String date;
String time;
int version;

public Secondquestion(int authorId, String author, String supervisor, String date, String time, int version) {
	
	this.authorId = authorId;
	this.author = author;
	this.supervisor = supervisor;
	this.date = date;
	this.time = time;
	this.version = version;
}
void description() {
	System.out.println("information of class");
}

public static void main(String[] args) {
	Secondquestion obj=new Secondquestion(101,"sudhir","Mahindra","20-02-3998","09-34-09", 5);
	
	System.out.println(obj.authorId);
	System.out.println(obj.author);
	System.out.println(obj.date);
	System.out.println(obj.time);
	System.out.println(obj.version);
	
	System.out.println(obj.supervisor);

}
}
