import java.util.*;

public class HRJavaDict {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num_rocks = Integer.parseInt(in.nextLine());
        Map<Character,Integer> rocks = new HashMap<Character, Integer>();
        for (int i=0; i<num_rocks; i++) {
            String rock = in.nextLine();
            for (int j=0; j<rock.length(); j++) {
                if (i==0) {
                    rocks.put(rock.charAt(i), new Integer(1));
                } else {
                    Integer val = rocks.get(rock.charAt(i));
                    if(val != null && val == i) {
                        val += 1;
                        rocks.put(rock.charAt(i), val);
                    }
                }
            }
        }

        int count = 0;
        for(Integer val: rocks.values()) {
            if(val == num_rocks)
                count += 1;
        }
        System.out.println(count);
    }
}
