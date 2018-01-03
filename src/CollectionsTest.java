import java.util.*;

public class CollectionsTest {

    public static void main(String args[]) {

        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("test1",1);
        map.put("test2",1);
        map.put("test3",1);

        Map<String,Integer> syncMap = Collections.synchronizedMap(map);

        System.out.println("Synchronized map: " + syncMap);
    }
}
