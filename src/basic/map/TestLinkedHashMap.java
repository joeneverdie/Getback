package basic.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        Map<String, Integer> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Joe" , 28);
        linkedMap.put("Jane" , 3);
        linkedMap.put("John" , 23);
        linkedMap.put("David" , 30);

        // fetching key
        System.out.println("Fetching key: " + linkedMap.keySet());

        // fetching value
        System.out.println("Fetching value: " + linkedMap.values());

        // fetching key-value pair
        System.out.println("Fetching key-value: " + linkedMap.entrySet());

        for (Map.Entry m : linkedMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
