import java.util.*;

public class CollectionHashMap {


    public static void printIterator(Iterator iterator) {
        System.out.println("");
        while(iterator.hasNext()) {
            Map.Entry map_entry = (Map.Entry)iterator.next();
            System.out.print(map_entry.getKey() + ":" + map_entry.getValue()  + " ,");
        }
    }

    public static void main(String args[]) {

        HashMap<Integer,String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        //unsorted
        printIterator(hmap.entrySet().iterator());

        Map<Integer,String> tree_map = new TreeMap<Integer, String>(hmap);
        //sorted
        printIterator(tree_map.entrySet().iterator());
    }
}
