package question8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Threaddemo {

	public static void main(String[] args) {

		Consumer<Integer>consumer=t->System.out.println("printing:"+t);
		List<Integer> list1=Arrays.asList(1,2,3,4);
		Threaddemo td=new Threaddemo();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				list1.stream().forEach(consumer);
			}
		});
		t1.start();
	}
}
