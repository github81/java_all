import java.lang.reflect.Parameter;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class HRRegexPattern {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int test_cases = Integer.parseInt(in.nextLine());
        while(test_cases>0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex) {
                System.out.println("Invalid");
            } finally {
                test_cases -= 1;
            }
        }
    }
}
