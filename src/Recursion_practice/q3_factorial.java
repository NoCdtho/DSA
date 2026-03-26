package Recursion_practice;

public class q3_factorial {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    static int recursion(int num){
        if(num == 1){
            return num;
        }
        return num * recursion(num -1);
    }
}
 // also try with void datatype