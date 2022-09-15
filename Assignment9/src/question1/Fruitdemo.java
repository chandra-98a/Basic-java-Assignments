package question1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fruitdemo {

    static List<Fruit> fruit = Arrays.asList(
            new Fruit("Apple",300,250,"red"),
            new Fruit("Avacado",50,150,"green"),
            new Fruit("Grapes",140,50,"red"),
            new Fruit("Lime",20,20,"yellow"),
            new Fruit("Stroberry",30,100,"pink"));

    public static void main(String[] args) {
 /*natural order*/       
       // List<Fruit> sortedList = fruit.stream()
			//.sorted((o1, o2) -> o1.getCalories() - o2.getCalories())
			//.collect(Collectors.toList());
//descending order of low priority
/*reverse*/
     List<Fruit> sortedList = fruit.stream()
			.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
			.filter(fruit-> fruit
					.getCalories() < 100)
			.collect(Collectors.toList());
 sortedList.forEach(System.out::println);
System.out.println(".............................................");
        
 /*sort by name*/
    /*   List<Fruit> sortedList = fruit.stream()
    			.sorted(Comparator.comparing(Fruit::getName)).
    			collect(Collectors.toList());
       sortedList.forEach(System.out::println);  */

//color wise list of fruit names
     List<Fruit> sortedList1 = fruit.stream()
     			.sorted(Comparator.comparing(Fruit::getColor)).
     			collect(Collectors.toList());
        sortedList1.forEach(System.out::println);
        System.out.println(".............................................");
        
//Red color fruit with price in ascending order
    	Stream<Fruit> filteredStream= fruit.stream().sorted(Comparator.comparing(Fruit::getPrice)).filter(fruit->fruit.getColor().equals("red"));
    	filteredStream.forEach(System.out::println);
    	
    	
    	
    }

	static class Fruit {

        private String name;
        private int calories;
        private int price;
        private String color;

       
        public Fruit(String name, int calories, int price, String color) {
			super();
			this.name = name;
			this.calories = calories;
			this.price = price;
			this.color = color;
		}

		

        public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getCalories() {
			return calories;
		}



		public void setCalories(int calories) {
			this.calories = calories;
		}



		public int getPrice() {
			return price;
		}



		public void setPrice(int price) {
			this.price = price;
		}



		public String getColor() {
			return color;
		}



		public void setColor(String color) {
			this.color = color;
		}



		@Override
        public String toString() {
            return "Fruit{" +
                   "name=" +name+"->"+  "calories=" +calories+"->"+ "price=" +price+
                   "->"+ "color=" +color+"}";
        }
    }
}