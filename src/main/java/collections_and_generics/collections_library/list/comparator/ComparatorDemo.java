package collections_and_generics.collections_library.list.comparator;

import collections_and_generics.collections_library.CollectionUtility;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.util.ArrayList;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = CollectionUtility.getNameList(ArrayList::new);

        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
