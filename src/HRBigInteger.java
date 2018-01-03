import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HRBigInteger {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        BigInteger big_num_one = new BigInteger(sc.nextLine());
        BigInteger big_num_two = new BigInteger(sc.nextLine());

        System.out.println(big_num_one.add(big_num_two));
        System.out.println(big_num_one.multiply(big_num_two));

    }

}
