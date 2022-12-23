package basic.map;

import java.util.EnumMap;
import java.util.Map;

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class TestEnumMap {
    public static void main(String[] args) {
        Map<Days, String> days = new EnumMap<>(Days.class);

        days.put(Days.MONDAY, "1");
        days.put(Days.TUESDAY, "2");
        days.put(Days.WEDNESDAY, "3");
        days.put(Days.MONDAY, "4");

        for (Map.Entry day : days.entrySet()) {
            System.out.println(day.getKey() + " " + day.getValue());
        }
    }
}
