import java.util.*;
import java.io.*;

class Sort {

    Sort() {}
    public static int[] insertionSort(int[] data) {

        int i,j;
        int cur;
        for (i=0; i<data.length; i++) {
            j = i;
            cur = data[j];
            while(j>0 && data[j-1]>cur) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = cur;
        }

        return data;
    }

    public static void printArray(int[] data) {

        for (int i=0; i<data.length; i++)
            System.out.print(data[i] + ",");
        System.out.print("\n");
    }
}

class GameEntry {

    private String name;
    private int score;

    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
    public String toString() { return "(" + name + "," + score + ")"; }

}

public class DSArrays {

    private int numEntries = 0;
    private GameEntry[] board;

    public DSArrays(int capacity) {
        board = new GameEntry[capacity];
    }

    public void add(GameEntry e) {

        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries-1].getScore()) {
            if (numEntries < board.length)
                numEntries += 1;
            int j = numEntries - 1;
            while (j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }


    public static void main(String args[]) {

        //int data[] = {7,1,3,5,6,9,10};
        //data = Sort.insertionSort(data);
        int[] data = new int[100];

        Random rand = new Random();
        for (int i=0; i<100; i++)
            data[i++] = rand.nextInt(100);
        Sort.printArray(data);
        Arrays.sort(data);
        Sort.printArray(data);
    }
}
