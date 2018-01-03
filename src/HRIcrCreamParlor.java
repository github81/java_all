import java.io.*;
import java.util.*;

public class HRIcrCreamParlor {

    public static void printCombination(ArrayList list, int money) {

        int startPos = 0;
        while(startPos<list.size()-1) {

            for (int i=startPos+1;i<list.size();i++) {
                int sum = (int)list.get(startPos) + (int)list.get(i);
                if(sum == money)
                    System.out.println((startPos+1) + " " + (i+1));
            }
            startPos += 1;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for (int i=0;i<numTestCases;i++) {
            int money = sc.nextInt();
            int numFlavors = sc.nextInt();
            ArrayList<Integer> costArrayList = new ArrayList();
            for (int j = 0; j < numFlavors; j++) {
                costArrayList.add(sc.nextInt());
            }
            printCombination(costArrayList, money);
        }
    }
}
