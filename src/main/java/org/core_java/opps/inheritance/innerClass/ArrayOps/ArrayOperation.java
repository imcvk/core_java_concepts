package org.core_java.opps.inheritance.innerClass.ArrayOps;

public class ArrayOperation {
    private int[] numbers;

    public ArrayOperation(int[] ints) {
        this.numbers = ints;
    }

    public class Stats {
        double mean() {
            long sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        double medium() {
            return 0;
        }
    }
}
