public class subsequence {
    public static void main(String[] args) {
        subseq("", "abc");
    }
    static void subseq(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        subseq(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subseq(processed, unprocessed.substring(1));
    }
}
