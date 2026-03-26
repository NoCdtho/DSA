package Recursion_practice;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    //if the number is even divide it with 2
    //otherwise add+
    static public int numberOfSteps(int num) {
         return helper(num, 0);
    }
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return helper(num/2, count+1);
        }
        else{
            return helper(num-1, count+1);
        }
    }

    //1 method approach
    static public int numberOfSteps2(int num){
        if(num == 0){
            return 0;
        }
        if(num % 2 == 0){
            return 1+ numberOfSteps2(num/2);
        }
        else{
            return 1 + numberOfSteps2(num-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps2(14));
    }
}
