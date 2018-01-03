import java.util.*;

public class CollectionVector {

    public static void main(String args[]) {

        Vector<String> vec = new Vector<String>(2);

        vec.add("node5");
        vec.add("node2");
        System.out.println(vec);
        System.out.println(vec.size());
        System.out.println(vec.capacity());

        vec.add("node3");
        System.out.println(vec);
        System.out.println(vec.size());
        System.out.println(vec.capacity());

        Enumeration en = vec.elements();
        while(en.hasMoreElements())
            System.out.print(en.nextElement() + ",");

        List sub_list = vec.subList(1,2);
        System.out.println("\n" + sub_list);

        Collections.sort(vec);
        System.out.println("\nSorted: " + vec);


    }
}
