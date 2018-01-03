import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigDecimal;
import java.util.*;

public class HRBigDecimal {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println(s.length + "," + n);
        for (int i=0; i<n; i++) {
            s[i] = sc.next();
        }

        Arrays.sort(s, (Comparator<Object>) (o1, o2) -> {
            BigDecimal big_dec_one = new BigDecimal((String)o1);
            BigDecimal big_dec_two = new BigDecimal((String)o2);
            return big_dec_two.compareTo(big_dec_one);
        });

        for (int i=0; i<n; i++) {
            System.out.println(s[i]);
        }
    }
}
