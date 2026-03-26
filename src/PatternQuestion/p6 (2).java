package PatternQuestion;

//   *
//  * *
// * * *
//* * * *
// * * *
//  * *
//   *

public class p6 {

    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {

            int totalCol = row > n ? 2 * n - row  : row;

            int totalspaces = n - totalCol;
            for(int s= 0 ; s<totalspaces; s++){
                System.out.print(" ");
            }

            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
