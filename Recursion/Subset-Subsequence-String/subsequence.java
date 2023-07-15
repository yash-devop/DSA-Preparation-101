import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(subseqArraylist("", "abc"));
    }
    static void subseq(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        subseq(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }
    // Returning the ArrayList of String :
    static ArrayList<String> subseqArraylist(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> left =  subseqArraylist(processed + unprocessed.charAt(0), unprocessed.substring(1));
        ArrayList<String> right =  subseqArraylist(processed, unprocessed.substring(1));

        left.addAll(right);
        return left;
    }
}
