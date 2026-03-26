package Sorting.MergeSort;

import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,32,1,0,7};
        mergeSortInplace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //Function to merge sort in place
    static void mergeSortInplace(int[] arr, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end)/2;

        mergeSortInplace(arr, start, mid);
        mergeSortInplace(arr, mid + 1, end);
        mergeInPlace(arr, start, end, mid);

    }

    static void mergeInPlace(int[] arr, int start, int end, int mid){

        int[] mix = new int [end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j <= end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++){
            arr[start + l] = mix[l];
            //or use this
            //System.arraycopy(mix, 0, arr, start + 0, mix.length);
        }
    }

}
