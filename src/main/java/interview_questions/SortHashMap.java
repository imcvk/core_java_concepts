package interview_questions;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        ArrayList<Map.Entry> arrayList = new ArrayList<>(scores.entrySet());
        System.out.println(arrayList);

//        arrayList.sort((Comparator<? super Map.Entry>) Map.Entry.comparingByValue());
//        System.out.println(arrayList);
    }
}
