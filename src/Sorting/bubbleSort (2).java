package Sorting;
import java.util.*;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr= {1,2,3,7,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int []arr){
        for(int i = 0; i < arr.length; i++){
            boolean swap = false;
            for(int j = 1; j < arr.length -i; j++ ){
                //swapping
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}
