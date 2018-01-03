import java.util.*;

public class CollectionHashTable {

    public static void main(String args[]) {

        Hashtable<String, String> hast_table = new Hashtable<String, String>();
        Enumeration<String> names;

        hast_table.put("key1","Ashwini");
        hast_table.put("key2","Achu");
        hast_table.put("key3","Ash");

        names = hast_table.keys();
        while(names.hasMoreElements()) {
            System.out.print(names.nextElement() + ",");
        }



    }
}
