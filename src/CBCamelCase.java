import java.util.*;
import java.io.*;

class CBCamelCase {
    public static String CBCamelCase(String str) {

        String[] newStr = str.split("\\W+");
        System.out.println(newStr.toString());
        String camelCase = "";
        int count = 0;
        for(String sen : newStr){
            if(count == 0){
                camelCase += sen.toLowerCase();
            }else if(count != 0){
                camelCase += Character.toString(sen.charAt(0)).toUpperCase();
                camelCase += sen.substring(1,sen.length()).toLowerCase();
            }


            count++;

        }
        return camelCase;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CBCamelCase(s.nextLine()));
    }

}