package LINEARSEARCH;

import java.util.Arrays;

public class Searchin2darray {
    public static void main(String[] Args) {
        int[][] arr = {{1, 23, 532, 765, 22},
                {23, 4, 56},
                {23, 76, 7,9}
        };
        int target = 532;
        int []ans = search(arr, target);
        int []ans2 = search2(arr, target);
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][]arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr.length; col++){
                if(arr[row][col] == target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search2(int[][]arr, int target){
        for(int []ints: arr){
            for(int elements: ints){
                if(elements == target){
                    return ints;
                }
            }
        }
        return new int[]{-1,-1};
    }
}