package Recursion_practice;

import java.sql.SQLOutput;

public class DigitsProducts {
    public static void main(String[] args) {
        System.out.println(product(2345));
    }
    static int product(int num){
        if (num % 10 == num){
            return num;
        }
        return (num % 10) * product(num/10);
    }
}
