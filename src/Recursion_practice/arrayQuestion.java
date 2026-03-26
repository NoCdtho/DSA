package Recursion_practice;

public class arrayQuestion {


    public static void main(String[] args) {
    int i = 0;
    int arr[] = {1,2,3,4,5,6};
    checkSorted(arr, i);
    System.out.println(checkArray(arr, i));
    }

    //My code
    static void checkSorted(int[] arr, int i){

        if(arr.length == 0){
            System.out.println("The array is empty...");
            return;
        }

        if(arr.length - 1 == i){
            System.out.println("The array is sorted.");
            return;
        }

        if(arr[i] < arr[i+1]){
            ++i;
        checkSorted(arr, i);
        }
        else{
            System.out.println("The array is not sorted....");
        }

    }

    //His code
    static boolean checkArray(int[] arr, int index){
        //return true if sorted otherwise return false

    //base case
    if(arr.length == 0){
            return false;
    }

    //base case
    if(arr.length - 1 == index){
        return true;
    }

    return arr[index] < arr[index + 1] && checkArray(arr, index + 1);
    }
}
