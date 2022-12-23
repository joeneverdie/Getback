package basic.collection.set;

import java.util.*;

public class TestTreeSet {
    public static void main(String[] args) {
        TestTreeSet test = new TestTreeSet();
        Set<String> set = new TreeSet<>();

        set.add("joe");
        set.add("jane");
        set.add("david");
        set.add("james");
        set.add("joe");

        test.showElement(set);
        System.out.println("Before adding elements from a array");

        List<String> str = new ArrayList<>();
        str.add("dog");
        str.add("cat");
        str.add("turtle");
        str.add("bird");
        str.add("bee");

        set.addAll(str);
        System.out.println("After added elements from array");
        test.showElement(set);
    }

    public void showElement(Set<String> set) {
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
