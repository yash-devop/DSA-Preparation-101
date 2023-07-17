public class countPermutation{
    public static void main(String[] args) {
        System.out.println(subsequencePermutation("", "abc"));
    }
    static int subsequencePermutation(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        char ch = unprocessed.charAt(0);
        int count = 0 ;

        for (int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + subsequencePermutation(first + ch + second, unprocessed.substring(1));
        }
        return count;
    }
}