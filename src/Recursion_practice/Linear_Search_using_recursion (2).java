package Recursion_practice;

public class Linear_Search_using_recursion {

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5, 18};
        int target = 5;
        int index = 0;
        System.out.println(Search(arr, target, index));
        System.out.println(SearchIndex(arr, target, index));
        System.out.println(SearchLast(arr, target, arr.length - 1));
    }

    //Find the index of the target from the array
    static int Search(int[] arr, int target, int index) {
        //base case
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;

        } else {
            return Search(arr, target, index + 1);
        }
    }
    //return  (arr[index] < arr.length) && Search(arr, target, index + 1); this is
    //wrong because arr[index] < arr.length is boolean, and we cannot do this with boolean.

    //if only want to find that the target or not then
    static boolean SearchIndex(int[] arr, int target, int index) {
        //base case
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) && SearchIndex(arr, target, index + 1);
        // (||) if this is placed instead of (&&) it would call the recursion again and
        // again
        // if the target is found.
        //new concept line 35.
    }

    //Find index from last
    static int SearchLast(int[] arr, int target, int index) {
        //base case
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;

        } else {
            return SearchLast(arr, target, index - 1);
        }
    }
}
