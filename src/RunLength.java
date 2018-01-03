import java.util.*;
import java.io.*;

public class RunLength {


    public static String runLengthFunc(String str) {

        if (str.length()%2 != 0)
            return str;

        for (int i=0; i<str.length(); i+=2) {
            System.out.println(i + "," + str.charAt(i));
        }

        return str;
    }

    public static void main(String args[]) {

        //Scanner s = new Scanner(System.in);
        //System.out.println(runLengthFunc("a3d4f5"));

        boolean flag = true;
        char grade = 'A';
        byte b = 12;
        short s = 24;
        int i,j,k = 48;
        long l = 48l;
        float pi = 3.14f;
        double e = 2.7188;

    }
}
