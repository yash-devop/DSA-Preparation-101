public class NknightsProblem {
    public static void main(String[] args) {
        int n = 4; 
        boolean[][] mazeBoard = new boolean[n][n];

        knight(mazeBoard, 0, 0, 4);
    }
    static void knight(boolean[][] mazeBoard, int row, int col , int knights){
        if(knights == 0){
            display(mazeBoard);
            System.out.println();
            return;
        }

        if(row == mazeBoard.length - 1 && col == mazeBoard.length ){
            return;
        }


        if(col == mazeBoard.length){  //means it reaches the end of column(extreme right)
            knight(mazeBoard, row + 1, 0, knights); //check for the next row.
            return;
        }

        // BACKTRACKING...
        if(isSafe(mazeBoard,row,col)){
            mazeBoard[row][col] = true; // means that cell is safe to put the KNIGHT.
            // now go and check the next col ( row will be that only. and if col reaches the end. the above if(col==length) will hit)
            knight(mazeBoard, row, col+1, knights-1);
            mazeBoard[row][col] = false; // means that the position already contain the KNIGHT, mark it FALSE.
        }
        knight(mazeBoard, row, col+1, knights); // dont reduce the KNIGHT , coz u didnt place it 



    }
    private static boolean isSafe(boolean[][] mazeBoard, int row, int col) {
        // isValid is saying , is this a valid cordinate or it is running out of the MATRIX or not ?
        if(isValid(mazeBoard, row - 2, col - 1)){
            if(mazeBoard[row - 2][col - 1]){  // if it a valid coordinate, check whether knight is present at the cell or not
                // RETURNS true means KNIGHT is Present and false means not present.
                return false;
            }
        }
        if(isValid(mazeBoard, row - 1, col - 2)){
            if(mazeBoard[row - 1][col - 2]){  // if it a valid coordinate, check whether knight is present at the cell or not
                // RETURNS true means KNIGHT is Present and false means not present.
                return false;
            }
        }
        if(isValid(mazeBoard, row - 2, col + 1)){
            if(mazeBoard[row - 2][col + 1]){  // if it a valid coordinate, check whether knight is present at the cell or not
                // RETURNS true means KNIGHT is Present and false means not present.
                return false;
            }
        }
        if(isValid(mazeBoard, row - 1, col + 2)){
            if(mazeBoard[row - 1][col + 2]){  // if it a valid coordinate, check whether knight is present at the cell or not
                // RETURNS true means KNIGHT is Present and false means not present.
                return false;
            }
        }
        return true;  // means above conditions says no KNIGHT PRESENT. return that position is SAFE ... return true.
    }

    // created the function coz for isSafe() we have to check every time : row >=0 && row < mazeBoard.length && col >=0 && col < mazeBoard.length
    // thats y:
    // isValid is saying , is this a valid cordinate or it is running out of the MATRIX or not ?
    static boolean isValid(boolean[][] mazeBoard,int row, int col){
        if(row >=0 && row < mazeBoard.length && col >=0 && col < mazeBoard.length){
            return true;
        }
        return false;
    }
    private static void display(boolean[][] mazeBoard) {
        for (boolean[] row : mazeBoard) { // foreach row inside my mazeboard
            for (boolean element : row) { // and for each element inside that row
                if (element) { // if that element is true, means that the queen is Placed. just sout.
                    System.out.print("K ");
                } else { // means that there is not option to place the queen in that cell coz its false,
                         // just place 'X'
                    System.out.print("X ");
                }
            }
            System.out.println(); // print new line.
        }
    }
}
