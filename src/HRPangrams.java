import java.io.*;
import java.util.*;

public class HRPangrams {

    public static void main(String args[]) {

        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        for (int i=0; i<input.length(); i++) {
            if(!alphabet.isEmpty())
                alphabet.remove(""+input.charAt(i));
            else
                break;
        }

        System.out.println(alphabet.isEmpty()?"pangrams":"not pangrams");
    }
}
