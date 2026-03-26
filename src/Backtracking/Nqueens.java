package Backtracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 5;
    boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    //counts the number of ways to put queens
    //and shows how the board will look with help of function display and isSafe
    private static int queens(boolean[][] board, int r){
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
                count += queens(board, r+1);
                board[r][col] = false;
            }
        }
        return count;
    }
    //checks if the place is safe
    private static boolean isSafe(int r , int c, boolean[][] board){
        //check vertical
        for(int i = 0; i < r; i++){
            if(board[i][c]){
                return false;
            }
        }
        //checks left
        int maxLeft = Math.min(r, c);
        for(int i = 1; i <= maxLeft; i++){
            if(board[r-i][c-i]){
                return false;
            }
        }
        //checks right
        int maxRight = Math.min(r, board.length - 1 - c) ;
        for(int i = 1; i <= maxRight; i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        return true;
    }
    //prints how the board will look
    static void display(boolean[][] board){
        for(boolean[] arr: board){
            for(boolean val: arr){
                if(val){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
//task is to reduce the for loops or optimize the code using target parameter in the queens methood