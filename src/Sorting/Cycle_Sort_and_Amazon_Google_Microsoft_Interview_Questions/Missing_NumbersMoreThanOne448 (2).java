package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;
import java.util.*;

//find_all_the_numbers_dissappeared_in_an_array

public class Missing_NumbersMoreThanOne448 {
    public static void main(String[] args) {
    int[] arr = {4,3,2,7,8,2,3,1};
    int[] arr1 = {1, 1};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
    missingNumbers(arr1);
    System.out.println(list);
    }
    //To sort the function
    static void cyclicSort(int[] arr){
    int i = 0;
        while(i < arr.length){
        int correctindex = arr[i] -1;
            if(arr[i] != arr[correctindex]){
            swap(arr, i, correctindex);
            }
            else{
            ++i;
            }
        }
    }
    //swap function
    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    static List<Integer> list = new ArrayList<>();
    static int missingNumbers(int[] arr){
        cyclicSort(arr);
            for (int i = 0; i < arr.length; i++) {
                int element = i + 1;
                if (arr[i] != element ) {
                    list.add(element);
                }
            }
        return Integer.MIN_VALUE;
    }
}
