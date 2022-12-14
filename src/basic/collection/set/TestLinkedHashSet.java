package basic.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> strs = new LinkedHashSet<>();

        strs.add("joe");
        strs.add("jane");
        strs.add("david");
        strs.add("alex");
        strs.add("david");

        Iterator<String> itr = strs.iterator();
        while (itr.hasNext()) System.out.println(itr.next());

    }
}
