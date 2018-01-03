import java.awt.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRStrangeCounter {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        int time = 1;
        long counter = 3;
        while (time+counter <= t) {
            time += counter;
            counter *= 2;
        }

        System.out.println(counter - (t - time));

    }
}
