import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {

    public static void main(String args[]) {

        int[] arr = {11,55,22,0,89};
        String[] arr2 = {"Steve", "Ajeet", "Kyle"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        List<String> fruits = new ArrayList<String>();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Grapes");
        Collections.sort(fruits);
        for(String s: fruits) System.out.print(s + ",");

    }
}
