public class palindrome {
    public static void main(String[] args) {
        String str = "abcdcbta";
        str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        boolean palindrome = false;
        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
                palindrome = true;
            }
            else{
                palindrome = false;
                break;
            }
        }
        if(palindrome == true){
            System.out.println("Yes its a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
