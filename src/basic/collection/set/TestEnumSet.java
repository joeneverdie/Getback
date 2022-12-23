package basic.collection.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class TestEnumSet {
    public static void main(String[] args) {
        TestEnumSet test = new TestEnumSet();

        Set<Days> days = EnumSet.of(Days.MONDAY,
                Days.SATURDAY,
                Days.FRIDAY,
                Days.THURSDAY,
                Days.SATURDAY);
        test.iterate(days);

        Set<Days> set1 = EnumSet.allOf(Days.class);
        System.out.println("set using allOf() method: " +set1);
        test.iterate(set1);

        Set<Days> set2 = EnumSet.noneOf(Days.class);
        System.out.println("set using noneOf() method: " + set2);
        test.iterate(set2);
    }

    public void iterate(Set<Days> e) {
        Iterator<Days> it = e.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
