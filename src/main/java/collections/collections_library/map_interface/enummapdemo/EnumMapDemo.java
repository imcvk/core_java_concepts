package collections.collections_library.map_interface.enummapdemo;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {

    public static void main(String[] args) {
        Map<Days, String> routine = new EnumMap<>(Days.class);
        routine.put(Days.MONDAY, "Walk");
        routine.put(Days.TUESDAY, "Upper");
        routine.put(Days.WEDNESDAY, "Lower");
        routine.put(Days.THURSDAY, "Cardio");
        routine.put(Days.FRIDAY, "Run");
        routine.put(Days.SATURDAY, "Meditation");
        routine.put(Days.SUNDAY, "Rest");
        for (Map.Entry<Days, String> entry : routine.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}
