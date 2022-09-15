package question1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{
	int testCase();
}



public class Testdemo1 {
int marks;
String grade;

public Testdemo1(int marks, String grade) {
	this.marks = marks;
	this.grade = grade;
}
@Test(testCase = 1)
int testCase() {
	return 1;
}

}
