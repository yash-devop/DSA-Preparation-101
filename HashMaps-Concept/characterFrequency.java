import java.util.HashMap;

public class characterFrequency {
    public static void main(String[] args) {
        String str = "abcdabejc";
        countFreq(str);
    }
    static void countFreq(String str){
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
