import java.util.*;
import java.io.*;

public class ScannerTest {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        while(!s.hasNextInt()) {
            System.out.println("invalid input: " + s.nextLine());
            System.out.print("Enter a number: ");
        }
        int i = s.nextInt();
        System.out.println(i);

    }

}
