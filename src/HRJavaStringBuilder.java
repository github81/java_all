import java.util.*;

public class HRJavaStringBuilder {

    public static int consecutiveChars(String str) {
        int num_deletions = 0;
        StringBuilder mutable_str = new StringBuilder(str);
        int pos = 0;
        while(pos<mutable_str.length()-1) {
            if(mutable_str.charAt(pos) == mutable_str.charAt(pos+1)) {
                mutable_str.deleteCharAt(pos);
                num_deletions += 1;
            } else {
                pos += 1;
            }
        }

        return num_deletions;
    }

    public static void main(String args[]) {

    }
}
