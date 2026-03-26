package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int []arr  = {1,4,3,64,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int []arr){
        int n = arr.length - 1;
        for(int i = 0; i <= n; i++){
            int last = n-i; //the last is value is changing
            int maxIndex = getmax(arr, 0,last);
            swap(arr,last, maxIndex);
        }
    }
    //giving the largest element from start to last.
    static int getmax(int []arr, int start, int end){
        int max = start;
        for(int j = start; j <= end; j++){
            if(arr[j] > arr[max]){
                max = j;
            }
        }
        return max;
    }
    //swapping of max and last
    static void swap(int []arr,int last, int max){
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }
}
