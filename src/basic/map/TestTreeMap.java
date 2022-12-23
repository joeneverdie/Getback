package basic.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> tree = new TreeMap<>();

        tree.put("Dog", 1);
        tree.put("Cat", 2);
        tree.put("Elephant", 3);
        tree.put("Bear", 4);
        tree.put("Mouse", 5);
        tree.put("Bee", 6);

        for (Map.Entry m : tree.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
