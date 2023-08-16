import java.util.*;
public class isMixture{
    public static void main(String args[]){
        List<String> wordList = Arrays.asList("apple", "banana", "cherry");
        String input = "pleap";

        System.out.println(checker(wordList, input));
    }

    public static boolean checker(List<String> wordList, String input){
        HashMap<Character , Integer> InputStringMap = new HashMap<Character , Integer>(); 

        for(char ch : input.toCharArray() ){
            if(InputStringMap.containsKey(ch)){
                InputStringMap.put(ch, InputStringMap.get(ch) + 1);
            }
            else{
                InputStringMap.put(ch, 1);
            }
        }

        for(String word : wordList){
            HashMap<Character , Integer> wordMap = new HashMap<Character , Integer>(InputStringMap);

            for(char ch : word.toCharArray()){
                if(!wordMap.containsKey(ch) || wordMap.get(ch) == 0){
                    break;
                }
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
                InputStringMap.put(ch, InputStringMap.get(ch) - 1);
            }
            if (wordMap.size() == word.length()) {
                return true;
            }

            // Reset inputStringMap for the next word
            InputStringMap.putAll(wordMap);
        }
        return false;
    }
}