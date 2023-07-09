public class smallestLetter {
    // leetcode 744.
    // Find smallest letter greater than target.
    /* eg: letters=['c','f','j'] target = 'a'
     output : 'c';
     */
    public static void main(String[] args) {
     //                    0  1  2
        char[] letters = {'c','f','j'};
        // char[] letters = {'x','x','y','y'};
        char target = 'a';
        System.out.println(smallestletter(letters, target));
    }
    static char smallestletter(char[] letters, char target){
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
