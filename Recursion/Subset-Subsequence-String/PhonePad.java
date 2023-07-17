public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
    }
    static void pad(String processed , String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = (int) unprocessed.charAt(0) - '0'; //this will convert '2' into 2
    
        for (int i = (digit - 1)*3; i < digit * 3; i++) {
            char ch = (char)('a' + i);

            pad(processed + ch, unprocessed.substring(1));
        }
    }
}
