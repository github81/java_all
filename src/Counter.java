public class Counter {

    public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};

    private int count;
    public Counter() { }
    public Counter(int initial) {
        count = initial;
    }
    public int getCount() {
        return  count;
    }
    public void increment() {
        count += 1;
    }

    public void printArr(double[] arr) {

        for(double val: arr) {
            System.out.println(val);
        }
    }

    public static void main(String str[]) {

        Counter c = new Counter(10);
        //System.out.println(c.getCount());
        //System.out.println(Day.TUE);

        int[] arr = {1,2,3,4,5};
        int[] arr2 = new int[5];
        double[] arr3 = {1.3,4.5,67.8};

        String s = Integer.toString(14);
        System.out.println(s);
        c.printArr(arr3);

    }
}
