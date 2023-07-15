public class skipAppButNotApple {
    public static void main(String[] args) {
        // remove app only when its not apple.
        // if apple , then dont remove app.
        System.out.println(skip("bacapplecdah"));
    }
    static String skip(String UnprocessedStr){
        if(UnprocessedStr.isEmpty()){
            return "";
        }
        if(UnprocessedStr.startsWith("app") && !UnprocessedStr.startsWith("apple")){
            String substring = UnprocessedStr.substring(5);
            return skip(substring);
        }
        return UnprocessedStr.charAt(0) + skip(UnprocessedStr.substring(1));
    }
    
}
