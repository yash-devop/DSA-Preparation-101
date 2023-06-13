public class smallestLetter {
    /*
    leetcode: 744 ( go and check the quest for better understanding.)
     Find the smallest letter greater than the target.

     */
    public static void main(String[] args) {
        char[] letters = {'c', 'f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters , char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;
            //because in ques, they asked for smallest letter greater than target ,thats y we do the below code.
            if(target < letters[mid]){ 
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
    

}
