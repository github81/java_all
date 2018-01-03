import java.util.*;
import java.io.*;

public class HRDiagonalDifference {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        String[] row;
        int left_diagonal = 0;
        int right_diagonal = 0;
        for (int i=0; i<length; i++) {
            row = sc.nextLine().split(" ");
            left_diagonal += Integer.parseInt(row[i]);
            right_diagonal += Integer.parseInt(row[length-1-i]);
        }
        System.out.println("Difference: " + (left_diagonal - right_diagonal));
    }
}
