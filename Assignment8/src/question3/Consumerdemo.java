package question3;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Consumerdemo {
		
public static void main(String[] args) {
	Consumer<String> consumer=t->System.out.println("printing:"+t);

	consumer.accept("Ramesh");
	List<String> list1=Arrays.asList("rama","lakshman");
	list1.stream().forEach(consumer);
}
}
