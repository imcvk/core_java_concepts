package collections_and_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Variable_Arguments {
    public static void main(String[] args) {
        Variable_Arguments v = new Variable_Arguments();
        int[] intArray = { 1, 2, 3 };
        ArrayList<Integer> arrayList =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(v.sum(intArray));
    }

    public long sum(int[] integers) {
        long sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        return sum;
    }
}
