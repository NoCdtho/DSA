package PatternQuestion;
//pattern 1
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *

//pattern 2
//        1
//      2 1 2
//    3 2 1 2 3
//  4 3 2 1 2 3 4
//5 4 3 2 1 2 3 4 5

//pattern 3
//      1
//    2 1 2
//  3 2 1 2 3
//4 3 2 1 2 3 4
//  3 2 1 2 3
//    2 1 2
//      1

public class p7 {
    public static void main(String[] args) {
    pattern1(5);
        System.out.println();

    pattern2(5);
        System.out.println();

    pattern3(5);
        System.out.println();

    }
    static void pattern1(int n){
        for(int row = 0; row < n; row++){

            int numOfSpaces = n - row - 1;
            for(int i = 0; i < numOfSpaces; i++){
                System.out.print(" ");
            }
            for(int col = 0; col <= row; col ++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    static void pattern2(int n){

        for(int row = 1; row <= n; row++){

            int numOfSpaces = n - row;
            for(int i = 0; i < numOfSpaces; i++){
                System.out.print("  ");
            }

            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }

            for(int col= 2; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {   //n == 4
        //        for(int row = 1; row <= n; row++){

//            if(row > 4){
//
//                int spaces = n - row - 1;
//                for( int space = 1; space <= spaces; space++){
//                    System.out.print(" ");
//                }
//
//                for(int col = row -2; col>= 1; col--){
//                    System.out.print(col+ " ");
//                }
//                for(int col = 2; col <= row-2; col++ ){
//                    System.out.print(col + " ");
//                }
//                System.out.println();
//            }

//            int numOfSpaces = n - row;
//            for(int i = 0; i < numOfSpaces; i++){
//                System.out.print("  ");
//            }
//
//            int colvalue = row > 4 ? colvalue1 : colvalue2;
//
//            int colvalue1 = ;
//
//            int colvalue2;
//
//            //col from start going backward
//            for(int col = row; col >= 1; col--){
//                System.out.print(col + " ");
//            }
//
//            //col after 1 going forward
//            for(int col= 2; col<=row; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        } // n n
        for (int row = 1; row <= 2 * n; row++) {

            int totalCol = row > n ? 2 * n - row  : row; //column changes after a some rows

            int totalspaces = n - totalCol;
            for(int s = 1 ; s <= totalspaces; s++){
                System.out.print("  ");
            }

            for (int col = totalCol; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for(int col = 2; col <= totalCol; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
