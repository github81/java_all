import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRHashSet {

    public static void main(String args[]) {

        HashSet hs = new HashSet();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int num_cases = Integer.parseInt(sc.nextLine());
        for (int i=0; i<num_cases;i++) {
            if (hs.add(sc.nextLine())) {
                count++;
            }
            System.out.println(count);
        }
    }
}
