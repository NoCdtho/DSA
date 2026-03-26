package Searching.BINARYSEARCH.BinarySearch2D;
import java.util.*;

public class SearchInSortedMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9},
        };
        System.out.println(Arrays.toString(Searchin2d(matrix, 7)));
    }

        //search in the provided row
     static int[] Matrixsearch ( int[][] arr, int row, int startcol, int endcol, int target){

            while (startcol <= endcol) {
                int mcol = startcol + (endcol - startcol) / 2;
                if (arr[row][mcol] == target) {
                    return new int[]{row, mcol};
                }
                if (arr[row][mcol] < target) {
                    startcol = mcol + 1;
                } else {
                    endcol = mcol - 1;

                }
            }
            return new int[]{-1, -1};
        }

        //search the target in the matrix
        static public int[] Searchin2d ( int[][] arr, int target){

            int row = arr.length;
            int col = arr[0].length;

            //if there is only one row
            if (row == 1) {
                return Matrixsearch(arr, 0, 0, col - 1, target);
            }

            int rowstart = 0;
            int rowend = row - 1;
            int colmid = col / 2; //constant in the  whole iteration

            //repeat this till you get 2 rows we are terminating the rows
            while (rowstart < rowend - 1) { //ensures we left with two rows.

                int rowmid = rowstart + (rowend - rowstart) / 2;

                if (arr[rowmid][colmid] == target) {
                    return new int[]{rowmid, colmid};
                }
                if (arr[rowmid][colmid] > target) {
                    rowend = rowmid;
                } else {
                    rowstart = rowmid;
                }
            }

            //after that loop ends means we have two rows
            //if the target is at middle column case 1
            if (arr[rowstart][colmid] == target) {
                return new int[]{rowstart, colmid};
            }
            if ((rowstart + 1 < row) && arr[rowstart + 1][colmid] == target) {
                return new int[]{rowstart + 1, colmid};
            }

            //case 2 if the target is at 1st row but less than colmid
            if (arr[rowstart][colmid] > target) {
                return Matrixsearch(arr, rowstart, 0, colmid - 1, target);
            }
            //case 3 if the target is at 2nd row but less than colmid
            if (arr[rowstart + 1][colmid] > target) {
                return Matrixsearch(arr, rowstart + 1, 0, colmid - 1, target);
            }
            //case 4 if the target is at 1st row but greater than colmid
            if (arr[rowstart][colmid] < target) {
                return Matrixsearch(arr, rowstart, colmid + 1, col - 1, target);
            }
            //case5 if the target is at second row and greater than middle column
            if(arr[rowstart + 1][colmid] < target) {
                return Matrixsearch(arr, rowstart + 1, colmid + 1, col - 1, target);
            }
            return new int[] {-1, -1};
        }
    }