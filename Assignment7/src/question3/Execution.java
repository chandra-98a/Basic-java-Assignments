package question3;

import java.lang.reflect.Method;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)


@interface Execute{

	int sequence();

	int myMethod1();
	int myMethod2();
	int myMethod3();
}



public class Execution {
	
public int myMethod1() {
		return 3;
	}
@Execute(sequence=3, myMethod2 =  0, myMethod3 = 0, myMethod1 = 0)
	public int myMethod2() {
		return 2;
		}
	
	public int myMethod3() {
			return 1;
			}

	public static void main(String[] args) {
		Execution exe=new Execution();
		Method[] methods=exe.getClass().getMethods();
		for(Method method: methods) {
			Execute annos =method.getAnnotation(Execute.class);
			if(annos!=null) {
			try {
				method.invoke(exe);
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		}
		System.out.println(exe.myMethod1());
		System.out.println(exe.myMethod2());
		System.out.println(exe.myMethod3());
}
}
