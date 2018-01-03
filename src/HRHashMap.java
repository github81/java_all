import java.util.*;
import java.io.*;

public class HRHashMap {

    public static void main(String args[]) {

        Map database = new HashMap();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i=0; i<n; i++) {
            String name = in.nextLine();
            String number = in.nextLine();
            database.put(name,number);
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            String number = (String)database.get(s);
            System.out.println(number==null?"Not found":s+"="+number);
        }
    }

}
