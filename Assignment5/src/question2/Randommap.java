package question2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Randommap extends HashMap {
    public Randommap() {
        super();
    }

    public Randommap(Map map) {
        super(map);
    }

    @Override
    public Collection values() {
        List randomList = new ArrayList(super.values());
        Collections.shuffle(randomList);

        return randomList;
    }

}