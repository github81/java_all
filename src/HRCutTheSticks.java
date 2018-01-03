import java.util.*;


public class HRCutTheSticks {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num_sticks = Integer.parseInt(sc.nextLine());
        int min_stick = 0;
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        for (int i=0; i<num_sticks; i++) {
            sticks.add(new Integer(sc.nextInt()));
        }
        while(sticks.size() > 0) {
            Collections.sort(sticks);
            int shortest_stick = sticks.get(0);
            System.out.println(sticks.size());
            for(int i=0; i<sticks.size();) {
                if (sticks.get(i) == shortest_stick) {
                    sticks.remove(i);
                }
                else {
                    sticks.set(i, sticks.get(i) - shortest_stick);
                    i += 1;
                }
            }
        }
    }
}
