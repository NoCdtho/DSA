package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;

import java.util.*;
//in this question only one number is repeated

class FindDublicateNumber287 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(findDuplicate(arr));
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


     static public int findDuplicate(int[] nums) {
        cycleSort(nums);
        //since 1 to n element = i +1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != i+1){
                return nums[i];
            }
        }
        return Integer.MIN_VALUE;
    }
    //anothe
}