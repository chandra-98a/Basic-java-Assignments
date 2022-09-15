package question7;


import java.util.HashMap;
import java.util.Map;


public class Mapping {



public String convertWithIteration(Map<Integer,String>map) {
	 StringBuilder mapAsString=new StringBuilder("{");
	    for (Integer key : map.keySet()) {
	        mapAsString.append(key + "=" + map.get(key) + ", ");
	    }
	    mapAsString.delete(mapAsString.length()-2, mapAsString.length()).append("}");
	    return mapAsString.toString();
	}
 
 
public static void main(String[] args) {
	

Map<Integer,String> web=new HashMap<>();
web.put(1, "one");
web.put(2, "two");
web.put(3, "three");
web.put(4, "four");

	System.out.println(web);

}

}


