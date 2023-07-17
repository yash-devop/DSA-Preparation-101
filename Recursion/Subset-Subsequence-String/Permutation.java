import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // subsequencePermutation("","abc");
        System.out.println(subsequencePermutationArrayList("","abc"));
    }
    static void subsequencePermutation(String processed , String unprocessed ){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            subsequencePermutation(first + ch + second, unprocessed.substring(1));
        }
    }
    static ArrayList<String> subsequencePermutationArrayList(String processed , String unprocessed ){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            ans.addAll(subsequencePermutationArrayList(first + ch + second, unprocessed.substring(1)));
        }
        return ans;
    }
}
