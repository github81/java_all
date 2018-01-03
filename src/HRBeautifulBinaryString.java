import java.io.*;

public class HRBeautifulBinaryString {

    public static void beautifulBinaryString(String b) {

        StringBuilder sb = new StringBuilder(b);
        String string_to_be_found = "010";
        int last_index = 0;
        while (last_index != -1) {

        }
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        final int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int last_index = 0;
        String string_to_be_found = "010";
        while(last_index != -1) {
            last_index = str.indexOf(string_to_be_found, last_index);
            if(last_index != -1) {
                count += 1;
                last_index += string_to_be_found.length();
            }
        }
    }
}
