public class TreesTest {

    public static boolean binarySearch(int[] data, int low, int high, int number) {

        boolean is_present = false;
        int middle = (low + high)/2;

        System.out.println(low + "," + high + "," + middle + "," + data[middle]);

        if (data[middle] == number)
            return true;
        else if (number > data[middle])
            return binarySearch(data,middle+1,high,number);
        else
            return binarySearch(data,low,middle-1,number);

    }

    public static void main(String args[]) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(TreesTest.binarySearch(arr,0,arr.length, 10));
    }
}
