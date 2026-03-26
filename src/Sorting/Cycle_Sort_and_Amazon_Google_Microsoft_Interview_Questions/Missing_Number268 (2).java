package Sorting.Cycle_Sort_and_Amazon_Google_Microsoft_Interview_Questions;
import java.sql.SQLOutput;
import java.util.Arrays;

//268. Missing Number
public class Missing_Number268 {
    public static void main(String[] args) {
        int[] arr = {0, 1,};
//      cyclicsort(arr);
//      System.out.println(Arrays.toString(arr));
        System.out.println(Find(arr));
    }

    static void cyclicsort(int[] arr){
        int index = 0;
        while(index < arr.length) {
            int correctindex  = arr[index]; //the index will be that element itself
//            if(arr[index] == arr.length){
//                ++index;
//            }
            //this part causes array index out of bound
            if (arr[index] < arr.length && arr[index] != arr[correctindex]){
                Swap(arr, index, correctindex);
            }
            else{
                ++index;
            }
        }
    }

    static void Swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int Find(int[] arr){
        cyclicsort(arr);
        for(int i = 0; i<arr.length; i++){
            if(i != arr[i]){
                return i;
            }
        }
        return arr.length;
    }
}
//    static int missingNumber(int[] arr){
//        int start = 0;
//        int end = arr.length;
//        int index = 0;
//        int element = index;
//
//        while(start <= end - 1) {
//            for (int i = 0; i <= end -1; i++) {
//                if (arr[i] == element) {
//                    ++index;
//                    break;
//                }
//
//            }
//            ++start;
//        }
//        return index;
//    }
//            if(element == 0){
//                Swap(arr, index, 0);
//                ++index;
//            }
//            if(element == 1){
//                Swap(arr, index, 1);
//                ++index;
//            }
//            if(element == 0){
//                Swap(arr, index, 0);
//                ++index;
//            }
//            if(element == 1){
//                Swap(arr, index, 1);
//                ++index;
//            }
