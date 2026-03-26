package Recursion_practice;

public class BinarySearch {

    public static void main(String[] args) {
    int[] arr = {1,2,3, 4, 6, 5, 7 ,8};
    int target = 7;
    System.out.println(BinarySearch(arr, target, 0, arr.length -1));
    }

    static int BinarySearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s  + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        //if start is less than mid
        if(arr[s] <= arr[mid]){
            if(target >= arr[s] && target <= arr[mid]){
                 return BinarySearch(arr, target, s, e-1);
            }
            else{
                return BinarySearch(arr, target, s + 1, e);
            }
        }
        //if start is greater than the mid
        if(target >= arr[mid] &&  target <= arr[e]){
            return BinarySearch(arr, target, s+1, e);
        }
        else{
            return BinarySearch(arr, target, s, e-1);
        }
    }
}
