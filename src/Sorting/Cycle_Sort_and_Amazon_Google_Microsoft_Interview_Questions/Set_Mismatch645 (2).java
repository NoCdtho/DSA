package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;
import java.util.*;
//https://leetcode.com/problems/set-mismatch

public class Set_Mismatch645 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 1, 4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static public void cyclicsort(int[] nums) {
        //1 to n
        //sort the nums cyclic sort

        int index = 0;
        while (index < nums.length) {
            if (nums[index] != nums[nums[index] - 1]) {
                swap(nums, index, nums[index] - 1);
            } else {
                ++index;
            }
        }
    }

    //swap function
    static public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    // To find the repeated number
    public int Repeat(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i+1){
                return arr[i];
            }
            ++i;
        }
        return -1;
    }

    //to find the lost number
    public int Lost(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] !=   i+1 ){
                return i+1;
            }
            ++i;
        }
        return -1;
    }
}
