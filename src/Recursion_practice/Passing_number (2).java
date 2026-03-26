package Recursion_practice;

public class Passing_number {
    public static void main(String[] args) {
        passNum(5);
    }
    static void passNum(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        passNum(--num);
    }
}
