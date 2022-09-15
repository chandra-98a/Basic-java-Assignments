package question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class Randomkeyvalues{
    public static void main(String[] args) {
        Map hashMap = makeHashMap();
        // you can make any Map random by making them a RandomMap
        // better if you can just create the Map as a RandomMap instead of HashMap
        Map randomMap = new Randommap(hashMap);

        // just call values() and iterate through them, they will be random
        Iterator iter = randomMap.values().iterator();

        while (iter.hasNext()) {
            String value = (String) iter.next();
            System.out.println(value);
        }
    }

    private static Map makeHashMap() {
        Map retVal;

        // HashMap is not ordered, and not exactly random (read the javadocs)
        retVal = new HashMap();

        // TreeMap sorts your map based on Comparable of keys
        retVal = new TreeMap();

        // RandomMap - a map that returns stuff randomly
        // use this, don't have to create RandomMap after function returns
        // retVal = new HashMap();

        for (int i = 0; i <= 10; i++) {
            retVal.put("key" + i, "value" + i);
        }

        return retVal;
    }
}
