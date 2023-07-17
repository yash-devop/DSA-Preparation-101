
public class AsciiValueOfCharacter {
    public static void main(String[] args) {
        char ch = 'a';
        subseqAscii("", "abc");
    }
    static void subseqAscii(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        subseqAscii(processed + unprocessed.charAt(0), unprocessed.substring(1));
        subseqAscii(processed, unprocessed.substring(1));
        subseqAscii(processed + (unprocessed.charAt(0)+0) , unprocessed.substring(1));
    }
}
