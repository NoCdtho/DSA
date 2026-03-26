package Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board, 0));
    }
    private static int knights(boolean[][] board, int r){
        //base condition
        if(r == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        //iterate over each cell
        for(int col = 0; col < board.length; col++){
            //check if that place is safe
            if(isSafe(r, col, board)){
                board[r][col] = true;
                count += knights(board, r+1);
                board[r][col] = false;
            }
        }
        return count;
    }
    //checks if the place is safe
    private static boolean isSafe(int r , int c, boolean[][] board){
        //check first
        if(isValid(r-2, c-1, board)){
            if(board[r-2][c-1]){
                return false;
            }
        }
        //checks Second
        if(isValid(r-1, c-2, board)){
            if(board[r-1][c-2]){
                return false;
            }
        }
        //checks third
        if(isValid(r-2, c+1, board)){
            if(board[r-2][c+1]){
                return false;
            }
        }
        //check fourth
        if(isValid(r-1, c+2, board)){
            if(board[r-1][c+2]){
                return false;
            }
        }

        return true;
    }
    //cheking if the position is valid
    private static boolean isValid(int r, int c, boolean[][] board){
        if(r >= 0 && r < board.length && c >= 0 && c < board.length){
            return true;
        }
        return false;
    }
    //prints how the board will look
    private static void display(boolean[][] board){
        for(boolean[] arr: board){
            for(boolean val: arr){
                if(val){
                    System.out.print("K ");
                }
                else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}

