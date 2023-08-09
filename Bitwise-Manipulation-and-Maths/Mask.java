public class Mask {
    public static void main(String[] args) {
        // QUES: find the ith bit of the number:
        // int[] num = {1,0,1,1,0,1,1,0};
        int num = 10110110;
        int i =1; // bit
        ans(num, i);
    }

    /*
     * pos: 12345678
     * question : 10110110
     * 
     * we know that if we AND 1 we get that number only.
     * 10110110
     * 11111111
     * _________
     * 10110110
     * ---------
     * 
     * but we want the 5th or ( ith ) bit
     * i.e : 10110110
     * 00001000
     * ________
     * 00001000
     * 
     * so , 00001000 is called Masking . how to get this ?
     * bit - 1 => 5 - 1 => 4 zeroes
     * 
     * so , 1 << i-1 means like this => 0 0 0 0 1
     * 
     * now AND it : 10110110
     * 00001000
     * _________
     * ans: 000010000
     * 
     */
    public static void ans(int num, int i) {
        int mask = 1 << i;
        int bit = (num & mask) == 0 ? 0 : 1;
        
        System.out.println("The " + i + "th bit of " + num + " is: " + bit);
    }
}
