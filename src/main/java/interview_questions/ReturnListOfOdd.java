package interview_questions;

import java.util.Arrays;
import java.util.List;

public class ReturnListOfOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 4, 89, 5, 63, 2, 5, 6, 10);
//        ArrayList list1 = new ArrayList<>();
//        for (Integer integer : list) {
//            if (integer % 2 == 0) {
//                list1.add(integer);
//            }
//        }
//        System.out.println(list1);
        System.out.println(getOddList(list));
    }
    public static boolean getOddList(List<Integer> list) {
       return list.parallelStream().anyMatch(x -> x % 2 != 0);
    }
}
