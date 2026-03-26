package Searching.BINARYSEARCH.BinarySearch2D;

import java.util.Arrays;

public class searchinmatrix {

    public static void main(String[] args) {
    int[][] arr = {{1, 23, 34},
                   {2, 32, 53},
                   {3, 43, 54} };
    int target = 43;
    System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {

        int row = 0;
        int column = arr.length -1;

        while (row < arr.length && column >= 0){

            //Case if the target is equal to element;
            if (arr[row][column] == target) {
                return new int[]{row, column};
            }

            //Case if the target is smaller than the element then column--;
            if (target < arr[row][column]) {
                --column;
            }

            //Case if the target is greater than the element then row++;
            else {
                ++row;
            }
        }
        return new int[]{-1, -1};
    }
}
