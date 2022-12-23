package basic.map;

import java.util.Hashtable;
import java.util.Map;

public class TestHashtable {
    public static void main(String[] args) {
        Map<String, Integer> hashTable = new Hashtable<>();

        hashTable.put("Dog", 1);
        hashTable.put("Cat", 2);
        hashTable.put("Elephant", 3);
        hashTable.put("Bear", 4);
        hashTable.put("Mouse", 5);
        hashTable.put("Bee", 6);

        for (Map.Entry m : hashTable.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
