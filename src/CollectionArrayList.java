import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.*;

public class CollectionArrayList {

    public static void compareArrayLists(ArrayList<String> al1, ArrayList<String> al2) {

        ArrayList<String> al3 = new ArrayList<String>();
        for (String temp: al1)
            al3.add(al2.contains(temp)?"Yes":"No");
        System.out.println(al3);
    }

    public static void main(String args[]) {


        String numbers = "1,2,3,4,5,6,7,8,9,10";

        ArrayList<String> obj = new ArrayList<String>();
        ArrayList<String> obj2 = new ArrayList<String>();
        List<String> obj3 = new ArrayList<String>();
        obj3 = Arrays.asList(numbers.split(","));

        System.out.println(obj3);

        obj.add("this");
        obj.add("is");
        obj.add("a beginning");
        //obj.remove(0);
        //obj.add(2,"not the end");

        obj2.add("this");
        obj2.add("is");
        obj2.add("a be3ginning");


        compareArrayLists(obj, obj2);

        //synchronized list
        List synch_list = Collections.synchronizedList(obj2);
        synchronized (synch_list) {
            Iterator iterator = synch_list.iterator();
            while(iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }


    }
}
