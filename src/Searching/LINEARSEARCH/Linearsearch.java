package Searching.BINARYSEARCH.LINEARSEARCH;


class Linearsearch{
public static void main(String[] args) {
    int[] arr = {5, 23, 43, 1, 2};
    int target = 21;
    System.out.println(search(arr, target));
}

static int search(int[] arr, int target) {

    for (int element : arr) {
        if (element == target) {
            return target;
        }
    }
    return -12;
    }
}
