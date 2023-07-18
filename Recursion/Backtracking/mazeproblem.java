import java.util.ArrayList;

/*
  this MAZE PROBLEMS file contains : 

  1) count the path
  2) print the path
  3) return the Path as ArrayList<String> or List<String>
  4) print / return the Diagonals also 
  5) includeAll the Paths ( BACKTRACKING !!)



  NOTE : D=> DOWN , L => LEFT , R=> RIGHT , U => UP
  in some question , V=> VERTICAL / DOWN   H => Horizontal/right and D=> Diagonal
 */
public class mazeproblem{
    public static void main(String[] args) {
        boolean[][] mazeBoard = {
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        // System.out.println(problem(3, 3));
        // printPath("", 3,3);
        // System.out.println(printPathArraylist("", 3,3));
        // System.out.println(printPathDiagonalArraylist("", 3,3));
        // printPathWithObstacles("",mazeBoard,0, 0);
        printAllPaths("", mazeBoard, 0, 0);

    }
    // problem1: Count the paths , the user can reach its Goal .
    static int problem(int row , int col){
        if( row == 1 || col == 1 ){
            return 1;
        }
        
        int left = problem(row-1, col);
        int right= problem(row, col - 1);
        
        
        return left + right ;
        
    }

    // problem2: print the paths , the user can reach its Goal .
    static void printPath(String processed , int row , int col){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }
        
        if(row > 1){
            printPath(processed + 'D', row-1, col);  
        }
        if(col > 1){
            printPath(processed + 'R', row, col-1);
        }
        
    }
    // problem2: print the paths but RETURN ARRAYLIST
    static ArrayList<String> printPathArraylist(String processed , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        
        if(row > 1){
            list.addAll(printPathArraylist(processed + 'D', row-1, col));
        }
        if(col > 1){
            list.addAll(printPathArraylist(processed + 'R', row, col-1));
        }
        
        return list;
    }
    static ArrayList<String> printPathDiagonalArraylist(String processed , int row , int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        
        if(row > 1){
            list.addAll(printPathDiagonalArraylist(processed + 'V', row-1, col));
        }
        if(col > 1){
            list.addAll(printPathDiagonalArraylist(processed + 'H', row, col-1));
        }

        if(row > 1 && col > 1){
            list.addAll(printPathDiagonalArraylist(processed + 'D', row-1, col-1));
        }
        
        return list;
    }

    static void printPathWithObstacles(String processed , boolean[][] maze ,int row , int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }

        if(!maze[row][col]){ // if that cell is false , execute this condition.
            return;
        }
        
        // note, last ques, we were taking (3,3) thats y row-1 and col-1 but now here we are taking (0,0) so incrementing r+1 and col+1.
        if(row < maze.length - 1){
            printPathWithObstacles(processed + 'V',maze, row+1, col);
        }
        if(col < maze[0].length - 1){
            printPathWithObstacles(processed + 'H',maze, row, col+1);
        }
    }




    // backtracking is used, why ? explained in the notes.  ( BACKTRACKING !! )
    static void printAllPaths(String processed , boolean[][] maze ,int row , int col){
        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(processed);
            return;
        }

        if(!maze[row][col]){ // if that cell is false , execute this condition. maze[row][col] = false.
            return;
        }

        // this block means that the cell is FALSE. im considering this cell in my PATH.

        maze[row][col] = false;
        
        // note, last ques, we were taking (3,3) thats y row-1 and col-1 but now here we are taking (0,0) so incrementing r+1 and col+1.
        if(row < maze.length - 1){
            printAllPaths(processed + 'D',maze, row+1, col);
        }
        if(col < maze[0].length - 1){
            //  why maze[0].length - 1 ? 
            // bcoz : we know in 2d arrays
            // suppose we have arr[3][3] and we want to access the first row.
            // to get the row , we do arr[0].
            // thats y , maze[0] and its length to traverse the indices over it.
            printAllPaths(processed + 'R',maze, row, col + 1);
        }
        if(row > 0){
            // row > 0 because if it was at cell (0,0) or (0,1) or (0,2) , it cant go UP (U).
            // whhy row -1 and col as it is ? because col is same and row is get reduced.
            printAllPaths(processed + 'U', maze, row - 1, col);  
        }
        if(col > 0){
            // col > 0 because if it was at cell (0,0) or (1,1) or (1,2) , it cant go LEFT (L).
            // whhy row -1 and col as it is ? because row is same and col is get reduced.
            printAllPaths(processed + 'L', maze, row, col - 1);
        }
        
        // this line is where the function will be over.
        // so before the function gets REMOVED , also make the changes that were made by the FUNCTION.
        maze[row][col] = true;
    }
}