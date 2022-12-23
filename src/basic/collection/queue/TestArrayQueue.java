package basic.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayQueue {
    public static void main(String[] args) {
        Deque<String> strs = new ArrayDeque<>();

        strs.add("joe");
        strs.add("jane");
        strs.add("zack");
        strs.add("michal");
        strs.add("david");
        strs.add("jenifer");

        for (String str : strs) {
            System.out.println(str);
        }
    }
}
