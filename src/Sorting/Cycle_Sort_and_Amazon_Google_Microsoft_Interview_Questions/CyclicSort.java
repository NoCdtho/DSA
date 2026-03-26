package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
         cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Function to sort using cyclicsort.
    static void cycleSort(int[] arr) {
        int i = 0;

      while(i < arr.length){
          int correctindex = arr[i] - 1;

          if(arr[correctindex] != arr[i]){
              swap(arr, correctindex, i);
          }
          else{
              i++;
          }
      }
    }

    //Function to swap
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}