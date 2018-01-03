import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class PatterMatching {
    public static String PatterMatching(String str) {

        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */


        Pattern p = Pattern.compile("([^=]+)=([^=]+)");
        Matcher m = p.matcher("sampleNumber=123 sampleNumber=456");

        System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)

        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(PatterMatching("test"));
    }

}