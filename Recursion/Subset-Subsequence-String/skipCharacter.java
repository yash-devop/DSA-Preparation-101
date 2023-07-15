public class skipCharacter{
    public static void main(String args[]){
        String str = "baccad";
        skipChar("",str);
        System.out.println(skipChar2(str));
    }
    // method 1: void
    static void skipChar(String ProcessedStr,String UnprocessedStr){
        if(UnprocessedStr.isEmpty()){
            System.out.println(ProcessedStr);
            return;
        }
        if(UnprocessedStr.charAt(0) == 'a'){
            skipChar(ProcessedStr, UnprocessedStr.substring(1));
        }
        else{
            skipChar(ProcessedStr + UnprocessedStr.charAt(0), UnprocessedStr.substring(1));
        }
    } 
    // method 2: return a string
    static String skipChar2(String UnprocessedStr){
        if(UnprocessedStr.isEmpty()){
            return "";
        }
        if(UnprocessedStr.charAt(0) == 'a'){
            return skipChar2(UnprocessedStr.substring(1));
        }
        return UnprocessedStr.charAt(0) + skipChar2(UnprocessedStr.substring(1));
        
    } 
}