package Searching.BINARYSEARCH.LINEARSEARCH;

// Solving the question using string conversion.

public class evennumbers{
    public static void main(String[] args) {
        int []arr = {12,345,2,6,7896};
        System.out.println(search(arr));
    }
    static int search(int []arr){
        int count = 0;
        if(arr.length == 0){
            return Integer.MIN_VALUE;
        }
        for(int index = 0; index < arr.length; index++){

            int a = arr[index];
            String str = Integer.toString(a);
            int num = str.length();
            if(num%2 == 0){
                count++;
            }
        }
        return count;
    }
}
