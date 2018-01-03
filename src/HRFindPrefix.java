import java.util.Arrays;
import java.util.Scanner;

public class HRFindPrefix {

    public static int findPrefix(String[] words) {

        int max_length = 0;
        Arrays.sort(words);

        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[i].charAt(0) != words[j].charAt(0))
                    break;
                int temp_length = 0;
                for(int k=0; k<Math.min(words[i].length(), words[j].length()); k++) {
                    temp_length += 1;
                }
                max_length = Math.max(temp_length, max_length);
            }
        }
        return max_length;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num_queries = Integer.parseInt(in.nextLine());
        for (int i=0; i<num_queries; i++) {
            int num_words = in.nextInt();
            in.nextLine();
            String[] words = new String[num_words];
            for(int j=0; j<num_words; j++)
                words[j] = in.nextLine();
            System.out.println(findPrefix(words));
        }
    }
}
