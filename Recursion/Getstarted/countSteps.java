public class countSteps {
    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
    public static void main(String[] args) {
        System.out.println(countstepBrute(14));
        System.out.println(countStepUsingRecursion(14));
    }
    // brute force:
    static int countstepBrute(int num){
        int stepsCount = 0;
        while(num > 0){
            if(num % 2==0){
                num /=2;
            }
            else{
                num -=1;
            }
            stepsCount++;
        }
        return stepsCount;
    }
    // by using recursion
    static int countStepUsingRecursion(int num){
        return helper(num, 0);
    }
    static int helper(int num , int steps){
        if(num == 0){
            return steps;
        }
        if(num % 2 == 0){
            return helper(num / 2,++steps);
        }
        else{
            return helper(num - 1,++steps);
        }
    }
}
