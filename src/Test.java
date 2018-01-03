import java.util.*;

public class Test {


    public static void toh(ArrayList<Integer> tower1, ArrayList<Integer> tower2, ArrayList<Integer> tower3) {


    }

    public static int min_subarr(int[] arr, int target) {

            int min_length = -1;
            for (int i=0; i<arr.length; i++) {
                int sum = 0;
                for(int j=i; j<arr.length;j++) {
                    sum += arr[j];
                    if (sum == target && ((j-i+1) < min_length || min_length == -1)) {
                        min_length = j-i+1;
                    }
                    if (sum > target)
                        break;
                }
            }
            return min_length;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4, "Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        //System.out.println("Before Sorting:");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            //System.out.print(me.getKey() + ": ");
            //System.out.println(me.getValue());
        }
        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        //System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry)iterator2.next();
            //System.out.print(me2.getKey() + ": ");
            //System.out.println(me2.getValue());
        }

        int arr[] = {7,1,1,1,1,1,13,4,8,2,8,4,6};
        int target = 5;
        System.out.println(min_subarr(arr,target));
    }
}