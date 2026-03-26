package Recursion_practice;

public class Reverse_number {

    static int sum = 0;

    //My_code
    static void revNum(int num){
        if(num == 0){
            return;
        }
        int result = num % 10;
        System.out.print(result);
        revNum(num/10);
    }

    //method 1
    static void rev1(int num){
        if(num == 0){
            System.out.println(sum);
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev1(num/10);
    }

    public static void main(String[] args) {
//        revNum(1234);
         rev1(1234);

    }
}
