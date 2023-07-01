import java.util.*;

public class Concept {
    public static void main(String[] args) {
        // creation.
        // eg: Country Population
        // HashMap<key,value> name = new HashMap<key,value>();

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Insertion /put / add

        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        // if i again added the same key ,
        map.put("China", 200);
        System.out.println(map);

        // Search:

        if (map.containsKey("India")) { // returns true if exist else false.
            System.out.println("key Present in map.");
        } else {
            System.out.println("Key not present.");
        }

        //
        System.out.println(map.get("China")); // returns value of the key.
        System.out.println(map.get("indonesia")); // key doesnt exist it prints Null.

        // iteration in HashMap
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Map.Entry<String, Integer> maxEntry = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        System.out.println("Max value is : "+maxEntry.getValue());

    }
}