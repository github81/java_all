import java.util.*;

public class HRInsertionSort {

    public static void printArray(int ar[]) {
        for(int i=0; i<ar.length; i++)
            System.out.print(ar[i] + " ");
        System.out.println("");
    }

    public static void insertionSort(int ar[]) {

        int numToInsert = ar[ar.length-1];
        int pos = ar.length-2;
        while(pos>=0) {
            if(ar[pos]>numToInsert) {
                ar[pos + 1] = ar[pos];
                printArray(ar);
                pos -= 1;
            } else {
                ar[pos + 1] = numToInsert;
                printArray(ar);
                break;
            }
        }
        if(pos == -1) {
            ar[0] = numToInsert;
            printArray(ar);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for(int i=0; i<s; i++)
            ar[i] = sc.nextInt();
        insertionSort(ar);
    }
}
