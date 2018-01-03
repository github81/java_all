import java.util.*;

public class HRCamelCase {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i=0; i<input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i)))
                count += 1;
        }
        System.out.println(count + 1);
    }
}
