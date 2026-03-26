package Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8,65,  4,-3,-87,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quicksort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e = high;

        int m = s + (e-s)/2;

        int pivot = arr[m];

        while(s <= e) {

            while (arr[s] < pivot && s <= e) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
             //swap the values greater than pivot in front with the values that are smaller in the end.
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quicksort(arr, low ,e);
        quicksort(arr, s, high);
    }
}
