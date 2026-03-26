package LINEARSEARCH;

public class MaxWealth {
    public static void main(String[] args) {
       int [][]accounts = { {1,2,3},      //row is horizontal line
                            {3,2,1} };    //column is vertical line
    }
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int row = 0; row < accounts.length; row++){
            int sum = 0;
            for(int col = 0; col < accounts[row].length; col++){  //Access the every col of a row
                 sum = sum + accounts[row][col];
                 if( max < sum){
                     max = sum;
                }
            }
        }
        return max;
    }
}
