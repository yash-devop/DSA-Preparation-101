import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesFromString {
    public static void main(String[] args) {
        String str = "test string";
        // duplicatesUsingMap(str);
        duplicatesUsingHashing(str);
    }

    // Approach 1 : using hashing
    static void duplicatesUsingHashing(String str) {
        int NoOfChars = 256;

        int[] count = new int[NoOfChars];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        // System.out.println(Arrays.toString(count));
        for (int i = 0; i < NoOfChars; i++) {
            if (count[i] > 1) {
                System.out.println((char) (i) + "=" + count[i]);
            }
        }
    }

    // Approach2:hashmap
    static void duplicatesUsingMap(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 1) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry mapElement : map.entrySet()) {
            int value = (int) (mapElement.getValue());
            if (value > 1) { // means only get the duplicate elements.
                System.out.println(mapElement.getKey() + "=" + mapElement.getValue());
            }
        }
    }
}