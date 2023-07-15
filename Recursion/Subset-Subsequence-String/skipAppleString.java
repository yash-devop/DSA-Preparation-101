public class skipAppleString {
    public static void main(String[] args) {
        System.out.println(skipApple("bcappledd"));
    }
    static String skipApple(String UnprocessedStr){
        if(UnprocessedStr.isEmpty()){
            return "";
        }
        if(UnprocessedStr.startsWith("apple")){
            return skipApple(UnprocessedStr.substring(5));
        }
        return UnprocessedStr.charAt(0) + skipApple(UnprocessedStr.substring(1));
        
    } 
}
