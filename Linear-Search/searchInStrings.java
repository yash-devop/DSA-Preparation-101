public class searchInStrings {
    public static void main(String[] args) {
        // note : '' are used for chararacters and " " are used for string.
        String str = "string";
        char target = 'i';
        // char target = 'q';
        System.out.println(search(str, target));
    }
    static boolean search(String str , char target){
        // if length = 0;
        if(str.length() == 0){
            return false;
        }

        // charAt(index) basically traverses the string and checks its each character.
        // checking that target with the string each character.
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
