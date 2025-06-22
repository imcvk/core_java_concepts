package core_java.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurrences {
    static Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 5, 6, 47, 4, 2, 3, 1, 7};
        findOccurrences(arr, 6);
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
    public static void findOccurrences(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j]) {
                    count++;
                }
            }
            if (!map.containsKey(temp)) {
                map.put(temp, count);
            }
        }
    }
}
