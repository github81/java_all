import java.io.*;
import java.util.*;


public class GenericPair<A,B> {

    A first;
    B second;

    public GenericPair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public A getFirst() { return this.first; }
    public B getSecond() { return this.second; }

    public static void main(String args[]) {

        GenericPair<Integer, Float> GP;
        GP = new GenericPair(1,1.5f);

        //Integer intObj = GP.getFirst();
        //Float floatObj = GP.getSecond();

        System.out.println(GP.getFirst().intValue());
        System.out.println(GP.getSecond().floatValue());
    }
}
