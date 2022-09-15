package question1;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

	public class Treequestion {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Map<Long,String> treemap= new TreeMap<Long,String>(Collections.reverseOrder());
	treemap.put(9154321867L, "amit");
	treemap.put(8765432195L, "Baby");
	treemap.put(5678465334L, "candy");
	treemap.put(6785478998L, "sam");
	treemap.put(7865432135L, "dump");
	Set set=treemap.entrySet();
	Iterator i=set.iterator();
	while(i.hasNext()) {
		Map.Entry me= (Map.Entry)i.next();
		System.out.println(me.getKey()+":"+me.getValue());
	}
	


		}
}
