package Searching.BINARYSEARCH.LINEARSEARCH;

public class min {
    public static void main(String[] args) {
        int[] arr = {100,23,45,6,32};
        System.out.println(min(arr));
    }

    static int min(int []arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length; i++){
            if( temp > arr[i]){
                temp = arr[i];
            }
        }
        return temp;
    }
}
