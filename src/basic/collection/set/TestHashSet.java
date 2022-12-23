package basic.collection.set;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();

        strs.add("joe");
        strs.add("jane");
        strs.add("zack");
        strs.add("david");
        strs.add("joe");

        Iterator<String> itr = strs.iterator();
        while (itr.hasNext()) System.out.println(itr.next());
    }
}
