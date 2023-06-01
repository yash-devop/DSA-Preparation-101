public class richestCustomer{
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{3,2,1}};
        int ans = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length ; row++){
            int sum=0;
            for(int col = 0; col < arr[row].length; col++){
                sum = sum + arr[row][col];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        System.out.println(ans);
    }
}