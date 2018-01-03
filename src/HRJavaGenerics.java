


public class HRJavaGenerics {

    public static <T> void printArray(T[] arr) {

        for(int i=0; i<arr.length; i++) {

            System.out.println(""+arr[i]);
        }
    }

    public static void main(String args[]) {

        String[] names = {"hello", "world"};
        Integer[] scores = {1,2,3,4,5};

        printArray(names);
        printArray(scores);

    }
}

