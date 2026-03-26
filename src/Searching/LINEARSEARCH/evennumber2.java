package Searching.BINARYSEARCH.LINEARSEARCH;

public class evennumber2 {
    public static void main(String[] args) {
        int []arr = {12,345,2,6,7896};
        System.out.println(Numberofdigits(arr));
        System.out.println(digits(218));
    }

    static int Numberofdigits(int[]arr){
        int count = 0;
        for(int num: arr){  // num knows the number of digits in an integer
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //checks if the number of digits is even or not.
    static boolean even(int num){
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    //number of digits in a integer.
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    static int digits2(int num){
        if(num < 0 ){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
