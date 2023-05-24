public class ColNoFixed {
    public static void main(String[] args) {
        // dynamic
        
        int[][] arr = 
        {
            {1 , 2 , 3 },
            {4 , 5 },
            {7 , 8 , 9 },
        };

        for(int row =0 ;row < arr.length ; row++){
            for(int col=0;col < arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
