public class NqueensProblem {
    /*
     * true ==> queen is present at that cell
     * false ==> queen is not present at that cell and other calls can place queen
     * over there.
     
        why we took Count ?? 
        bcoz we need to print how many ways it find the answers
     */
    public static void main(String args[]) {
        int n = 4;
        boolean[][] mazeBoard = new boolean[n][n];
        System.out.println(queens(mazeBoard, 0));
    }

    static int queens(boolean[][] mazeBoard, int row) {
        // base condition of recursion.
        if (row == mazeBoard.length) { // if the row reachs the length. return.
            display(mazeBoard);
            System.out.println(); // whenever u display the board, add a new line.
            return 1;
        }

        // placing the queen and checking for every row and col.
        int count = 0;
        for (int col = 0; col < mazeBoard.length; col++) {

            // BACKTRACKING...
            // place the queen if it is Safe .
            if (isSafe(mazeBoard, row, col)) { // means for 0,0 try then 0,1 then 0,2 till length of the board.
                mazeBoard[row][col] = true; // okay ,put the queen and check the below ones.
                // now try to check the other below it , through recursive calls.
                // this queen is place , now try to see for the below rows.
                count = count + queens(mazeBoard, row + 1); // go and check the below rows.
                mazeBoard[row][col] = false; // when i come out of the recursive call , change it back to FALSE.
                                             // (discussed in my notes.)
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] mazeBoard, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (mazeBoard[i][col]) { // means if that cell is true, means queen is present there
                return false; // hence , it is not safe to place it.
            }
        }
        // check diagonal LEFT
        // maxLeft means maximum how much it can go to left ? obviously till the length.
        int maxLeft = Math.min(row, col); // for this line, see notion notes.

        for (int i = 1; i <= maxLeft; i++) {
            if (mazeBoard[row - i][col - i]) { // going left diagonal eg: we are at [3,3] and left diagonal is [2,2] ,
                                               // so row-i and col-i and if that cell is true, means queen is present
                                               // there
                return false; // hence , it is not safe to place it.
            }
        }

        // check Diagonal RIGHT

        int maxRight = Math.min(row, mazeBoard.length - col - 1); // for this line, see notion notes.
        for (int i = 1; i <= maxRight; i++) {
            if (mazeBoard[row - i][col + i]) { // going right diagonal eg: we are at [3,3] and right diagonal is [2,4] ,
                                               // so row-i and col+i and if that cell is true, means queen is present
                                               // there
                return false; // hence , it is not safe to place it.
            }
        }

        // means yes , queen is not present by checking all the above checks.
        // means now you can place it in that cell.

        return true;
    }

    private static void display(boolean[][] mazeBoard) {
        for (boolean[] row : mazeBoard) { // foreach row inside my mazeboard
            for (boolean element : row) { // and for each element inside that row
                if (element) { // if that element is true, means that the queen is Placed. just sout.
                    System.out.print("Q ");
                } else { // means that there is not option to place the queen in that cell coz its false,
                         // just place 'X'
                    System.out.print("X ");
                }
            }
            System.out.println(); // print new line.
        }
    }
}
