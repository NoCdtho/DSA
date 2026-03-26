package Backtracking;

public class SudokuSolver {

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("cannot solve");
        }
    }

    // main method
    private static boolean solve(int [][]board){
        int row = -1;
        int col = -1;
        boolean Emptyleft = true;
        //finding the row and col
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board.length; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    Emptyleft = false;
                    break;
                }
            }
            //if i found a empty cell then break
            if(!Emptyleft){
                break;
            }
        }
        if(Emptyleft){
            //means the sudoku is solved
            return true;
        }
        //backtrack
        for(int number = 1; number <= 9; number++){
            if(isSafe(board, row, col, number)){
                board[row][col] = number;
                //now this might be false i will check for the others cell to put the number ion the
                if(solve(board)){
                    //ans is found
                    return true;
                }
                else{
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    //display
    private static void display(int[][] board){
        for(int[] arr: board){
            for(int num: arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //checks if the number is safe to put or not
    private static boolean isSafe(int[][] board, int row, int col, int num){

        // row check: horizontal check
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        //col check: vertical check
        for(int[] arr1: board){
            if(arr1[col] == num){
                return false;
            }
        }

        //check in the 1 part of the board
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for(int r = rowStart; r < rowStart + sqrt; r++){
            for(int c = colStart; c < colStart + sqrt; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
